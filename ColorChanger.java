import java.awt.*;
import java.awt.event.*;

public class ColorChanger extends Frame implements ActionListener {

    Label title, fgLabel, bgLabel, headLabel, nameLabel, rollLabel, branchLabel, textLabel;
    TextField fgText, bgText;
    Button applyButton;
    Window resultWindow;

    ColorChanger() {

        setTitle("AWT Color Changer");
        setSize(1920, 1080);
        setLayout(null);
        setVisible(true);
        setBackground(new Color(250, 250, 250));

        title = new Label("AWT Foreground & Background Color Changer");
        title.setFont(new Font("Arial", Font.BOLD, 18));
        title.setBounds(350, 50, 420, 30);
        add(title);

        fgLabel = new Label("Enter Foreground Color:");
        fgLabel.setFont(new Font("Arial", Font.PLAIN, 14));
        fgLabel.setBounds(360, 110, 180, 25);
        add(fgLabel);

        fgText = new TextField();
        fgText.setBounds(550, 110, 180, 25);
        add(fgText);

        bgLabel = new Label("Enter Background Color:");
        bgLabel.setFont(new Font("Arial", Font.PLAIN, 14));
        bgLabel.setBounds(360, 160, 180, 25);
        add(bgLabel);

        bgText = new TextField();
        bgText.setBounds(550, 160, 180, 25);
        add(bgText);

        applyButton = new Button("Apply Colors");
        applyButton.setFont(new Font("Arial", Font.BOLD, 13));
        applyButton.setBounds(470, 220, 150, 35);
        add(applyButton);

        textLabel = new Label("*default color is lightGray");
        textLabel.setFont(new Font("Arial", Font.PLAIN, 10));
        textLabel.setBounds(550, 200, 130, 13);
        textLabel.setForeground(Color.red);
        add(textLabel);
        applyButton.addActionListener(this);

        resultWindow = new Window(this);

        headLabel = new Label("User Details ");
        headLabel.setFont(new Font("Arial", Font.BOLD, 20));
        headLabel.setAlignment(Label.CENTER);
        headLabel.setBounds(80, 10, 200, 30);
        resultWindow.add(headLabel);

        resultWindow.setLayout(null);
        // resultWindow.setBackground(Color.blue);
        resultWindow.setSize(400, 200);
        resultWindow.setLocation(170, 300);

        resultWindow.setVisible(true);

        nameLabel = new Label("Name : V Chandra Harsha");
        nameLabel.setBounds(80, 60, 250, 30);
        nameLabel.setFont(new Font("Arial", Font.PLAIN, 18));
        resultWindow.add(nameLabel);

        rollLabel = new Label("Roll No : 25915A6711");
        rollLabel.setBounds(80, 110, 250, 30);
        rollLabel.setFont(new Font("Arial", Font.PLAIN, 18));
        resultWindow.add(rollLabel);

        branchLabel = new Label("Branch : CSE-(DS)");
        branchLabel.setBounds(80, 160, 250, 30);
        branchLabel.setFont(new Font("Arial", Font.PLAIN, 18));
        resultWindow.add(branchLabel);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    public Color getColor(String colorName) {

        if (colorName.equalsIgnoreCase("red"))
            return Color.red;

        else if (colorName.equalsIgnoreCase("blue"))
            return Color.blue;

        else if (colorName.equalsIgnoreCase("green"))
            return Color.green;

        else if (colorName.equalsIgnoreCase("yellow"))
            return Color.yellow;

        else if (colorName.equalsIgnoreCase("black"))
            return Color.black;

        else if (colorName.equalsIgnoreCase("white"))
            return Color.white;

        else if (colorName.equalsIgnoreCase("orange"))
            return Color.orange;

        else if (colorName.equalsIgnoreCase("pink"))
            return Color.pink;

        else if (colorName.equalsIgnoreCase("gray"))
            return Color.gray;

        else
            return Color.lightGray;
    }

    public void actionPerformed(ActionEvent ae) {

        String fg = fgText.getText();
        String bg = bgText.getText();

        Color foregroundColor = getColor(fg);
        Color backgroundColor = getColor(bg);

        if (foregroundColor.equals(Color.white)) {
            nameLabel.setForeground(Color.gray);
            rollLabel.setForeground(Color.gray);
            branchLabel.setForeground(Color.gray);
            headLabel.setForeground(Color.gray);
        } else {
            nameLabel.setForeground(foregroundColor);
            rollLabel.setForeground(foregroundColor);
            branchLabel.setForeground(foregroundColor);
            headLabel.setForeground(foregroundColor);
        }

        setBackground(backgroundColor);

        // nameLabel.setBackground(backgroundColor);
        // branchLabel.setBackground(backgroundColor);
        // rollLabel.setBackground(backgroundColor);
        resultWindow.setBackground(backgroundColor);
    }

    public static void main(String args[]) {
        new ColorChanger();
    }
}
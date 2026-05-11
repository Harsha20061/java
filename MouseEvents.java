import java.awt.*;
import java.awt.event.*;
public class MouseEvents extends Frame implements MouseListener {
    Label l;
    MouseEvents(){
        l = new Label();
        add(l);
        setSize(1920,1080);
        setVisible(true);
        setLayout(new FlowLayout());
        addMouseListener(this);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                System.exit(0);
            } 
        });
    }
    public void mouseClicked(MouseEvent e){
        l.setText("mouse clicked");
    }
    public void mousePressed(MouseEvent e){
        l.setText("mouse pressed ");
    }
    public void mouseReleased(MouseEvent e){
        l.setText("mouse released");
    }
    public void mouseExited(MouseEvent e){
        l.setText("mouse exited");
    }
    public void mouseEntered(MouseEvent e){
        l.setText("mouse entered");
    }
    public static void main(String[] args) {
        new MouseEvents();
    }
    
}

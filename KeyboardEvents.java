import java.awt.*;
import java.awt.event.*;
public class KeyboardEvents extends Frame implements KeyListener {
    Label l;

    KeyboardEvents(){
        l = new Label();
        add(l);
        setSize(1920, 1080);
        setLayout(new FlowLayout());
        setVisible(true);
        addKeyListener(this);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
    }
    public void keyPressed(KeyEvent e){
        l.setText("key pressed ");
    }
    public void keyReleased(KeyEvent e){
        l.setText("key released");
    }
    public void keyTyped(KeyEvent e){
        l.setText("key typed : " +e.getKeyChar());
    }
public static void main(String[] args) {
    new KeyboardEvents();
}
    
}

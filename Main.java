
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Main extends Frame implements MouseListener {
    Label display;
    Main(){
        display = new Label( " this is mouse");
        add(display);
        addMouseListener(this);
        setLayout(new FlowLayout());
        setVisible(true);
        setSize( 300 ,300);


    }


    public static void main(String[] args) {

        new Main();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        display.setText(" mouse clicked");

    }

    @Override
    public void mousePressed(MouseEvent e) {
        display.setText("mouse pressed");

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        display.setText(" mouse released");

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        display.setText(" mouse entered");

    }

    @Override
    public void mouseExited(MouseEvent e) {
        display.setText(" mouse exited");

    }
}
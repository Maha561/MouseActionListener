
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class Main extends Frame implements MouseMotionListener {
    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
        if(x<CircleX+circleRadius){
            CircleX++;
        }
        if(x>CircleX+circleRadius){
            CircleX--;
        }
        if(y<CircleY+circleRadius){
            CircleY++;
        }
        if(y>CircleY+circleRadius){
            CircleY--;
        }
        repaint();


    }

    int CircleX= 400;
    int CircleY = 400;
    int circleRadius = 50;
    public void paint(Graphics g){
        super.paint(g);
        g.setColor(Color.pink);
        g.fillOval(CircleX,CircleY,2*circleRadius,2*circleRadius);


    }



    Main(){
        setTitle(" Ball Game");

        setLayout(null);
        setVisible(true);
        setSize( 600 ,600);
        addMouseMotionListener(this);


    }


    public static void main(String[] args) {

        new Main();
    }




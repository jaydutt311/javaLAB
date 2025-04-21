import java.awt.*;
import java.awt.event.*;

class ClickCircles extends Frame implements MouseListener{
    int xAxis = 4;
    int yAxis = 4;
    int radius = 5;
    int max = 200;

    ClickCircles(){
        setSize(500, 400);
        addMouseListener(this);
        setVisible(true);
    }

    public void paint(Graphics g){
        if(radius < max){
            g.drawOval(xAxis- radius, yAxis-radius, 2*radius, 2*radius);
            radius++;
            try {
                Thread.sleep(10); // Adjust the animation speed here.
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            repaint();
        }
    }

    public void mouseClicked(MouseEvent e){
        xAxis = e.getX();
        yAxis = e.getY();
        radius = 5;
        repaint();
    }

    // mendatory to define all these methods from interface
    public void mousePressed(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}

    public static void main(String args[]){
        ClickCircles cc = new ClickCircles();
    }
}

import javax.swing.*;
import java.awt.*;

public class DrawCircle extends JFrame {

    public DrawCircle() {
        // title of graphics window
        setTitle("Circle Drawing");

        // size of graphics window
        setSize(400,400);

        // makes window visible
        setVisible(true);

        // exits application when closed using System exit
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override // method overriding - overrides paint() from parent JFrame
    public void paint(Graphics g) {
        // find the center of the panel
        int centerX = getWidth()/2;
        int centerY = getHeight()/2;
        
        // calculate radius
        int radius = getWidth()/4;

        // draw the circle
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawOval(centerX - radius, centerY - radius, radius * 2, radius * 2);
    }

    public static void main(String[] args) {
        // draw and display the circle
        new DrawCircle();
    }
}
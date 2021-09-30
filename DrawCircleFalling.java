import javax.swing.*;
import java.awt.*;

public class DrawCircleFalling extends JFrame{

    public DrawCircleFalling() {
        // title of graphics window
        setTitle("Circle Falling Drawing");

        // size of graphics window
        setSize(1000,1000);

        // makes window visible
        setVisible(true);

        // exits application when closed using System exit
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override // method overriding - overrides paint() from parent JFrame
    public void paint(Graphics g) {
        double gravity = 9.81; // in meters per second

        Graphics2D g2d = (Graphics2D) g;

        for (int t = 0; t <= 15; t++) { // in seconds
            double distance = 0.5 * gravity * t * t;

            g2d.drawOval(getWidth()/2, (int)Math.round(distance), 30, 30);

            System.out.println(distance);
        }
    }

    public static void main(String[] args) {
        // draw and display the circle
        new DrawCircleFalling();
    }
}

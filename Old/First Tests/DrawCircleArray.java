import javax.swing.*;
import java.awt.*;

public class DrawCircleArray extends JFrame {
    public DrawCircleArray() {
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
        // circle constants
        int circleW = 20;
        int circleH = 20;

        // draw the circle
        Graphics2D g2d = (Graphics2D) g;

        // loop draws as many circles as can fit based on window width and circle width
        for (int x = 1; x+1 < getWidth()/circleW; x++) {
            // x position shifts circle width units to the right each iteration, y position stays the same
            g2d.drawOval(circleW * x, circleH * 2, circleW, circleH);
        }
    }

    public static void main(String[] args) {
        new DrawCircleArray();
    }
}

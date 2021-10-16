import javax.swing.*;
import java.awt.*;

public class DrawCenteredCircles extends JFrame {
    public DrawCenteredCircles() {
        // title of graphics window
        setTitle("Centered Circles");

        // size of graphics window
        setSize(1200,1200);

        // makes window visible
        setVisible(true);

        // exits application when closed using System exit
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override // method overriding - overrides paint() from parent JFrame
    public void paint(Graphics g) {
        // circle constants
        int circleW = 40;
        int circleH = 40;

        int Xcenter = getWidth()/2;
        int Ycenter = getHeight()/2;

        // draw the circle
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        for (int i = -3; i <= 3; i++) {
            g2d.fillOval(Xcenter - circleW*i, Ycenter, circleW, circleH);
            g2d.fillOval(Xcenter - circleW*i, Ycenter + circleH, circleW, circleH);
            g2d.fillOval(Xcenter - circleW*i, Ycenter - circleH, circleW, circleH);
        }

        // g2d.fillOval(getWidth()/2 - circleW, getHeight()/2, circleW, circleH);
        // g2d.fillOval(getWidth()/2, getHeight()/2, circleW, circleH);
        // g2d.fillOval(getWidth()/2 + circleW, getHeight()/2, circleW, circleH);

        // g2d.fillOval(getWidth()/2 - circleW, getHeight()/2 + circleH, circleW, circleH);
        // g2d.fillOval(getWidth()/2, getHeight()/2 + circleH, circleW, circleH);
        // g2d.fillOval(getWidth()/2 + circleW, getHeight()/2 + circleH, circleW, circleH);
        // /////////////////////////////
        // g2d.fillOval(getWidth()/2 - circleW, getHeight()/2 - circleH, circleW, circleH);
        // g2d.fillOval(getWidth()/2, getHeight()/2 - circleH, circleW, circleH);
        // g2d.fillOval(getWidth()/2 + circleW, getHeight()/2 - circleH, circleW, circleH);

        System.out.println(getWidth()/2);
        System.out.println(getHeight()/2);

    }

    public static void main(String[] args) {
        new DrawCenteredCircles();
    }
}

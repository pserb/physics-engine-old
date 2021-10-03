import javax.swing.*;
import java.awt.*;
import java.util.Arrays;
import java.util.Random;

public class Animation extends JPanel {

    int x1, y1; // starting position (top left corner)
    int numCircles = 20;

    public void cycle() {
        // movement for all circles
        x1 += 1; // move 1 pixel each loop (every 10 ms)
        y1 += 1;
    }

    public int[][] colorArray() {

        int[][] colorArray = new int[numCircles][3];

        for (int arraynum = 0; arraynum < numCircles; arraynum++) {
            for (int colornum = 0; colornum < 3; colornum++) {
                colorArray[arraynum][colornum] = (int)(Math.random()*256);
            }
        }
        return colorArray;
    }

    int[][] colors = colorArray();

    @Override
    public void paint(Graphics g) {
        // circle constants
        int circleW = 40;
        int circleH = 40;

        int Xcenter = getWidth()/2;
        int Ycenter = getHeight()/2;

        super.paint(g); // invoked by swing to draw components - needed for repaint to work
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON); // turn on antialiasing

        for (int x = 0; x < numCircles; x++) {
            // x position shifts circle width units to the right each iteration, y position stays the same    

            g2d.setColor(new Color(colors[x][0], colors[x][1], colors[x][2]));
            g2d.fillOval(((Xcenter - circleW*x) + Xcenter/4) + x1, Ycenter + y1, circleH, circleH);
            g2d.fillOval(((Xcenter - circleW*x) + Xcenter/4) + x1, (Ycenter + circleH) + y1, circleW, circleH);
            g2d.fillOval(((Xcenter - circleW*x) + Xcenter/4) + x1, (Ycenter - circleH) + y1, circleW, circleH);
        }
    }

    public void run() throws InterruptedException {
        for (;;) {
            cycle();
            repaint();
            Thread.sleep(10);
        }
    }
}
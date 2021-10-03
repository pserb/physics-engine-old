import javax.swing.*;
import java.awt.*;

public class Animation extends JPanel {

    int x1, y1, x2, y2 = 0; // starting position (top left corner)

    public void cycle() {
        // movement for black circle
        x1 += 1; // move 1 pixel each loop (every 10 ms)
        y1 += 1;

        // movement for red circle
        x2 += 1.5;
        y2 += 2.5;
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g); // invoked by swing to draw components - needed for repaint to work
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON); // turn on antialiasing

        // draw for black circle
        g2d.fillOval(x1, y1, 30, 30); // draw filled oval at top left corner with diameter 30
        
        // draw for red circle
        g2d.setColor(Color.RED);
        g2d.fillOval(x2, y2, 30, 30);

        // for (int x = 1; x+1 < 20; x++) {
        //     // x position shifts circle width units to the right each iteration, y position stays the same       
        //     double dred = Math.random() * 256;
        //     double dgreen = Math.random() * 256;
        //     double dblue = Math.random() * 256;

        //     int red = (int)dred;
        //     int green = (int)dgreen;
        //     int blue = (int)dblue;
            
        //     g2d.setColor(new Color(red, green, blue));
        //     g2d.fillOval((30 * x) + x1, (30 * 2) + y1, 30, 30);
        // }
    }

    public void run() throws InterruptedException {
        for (;;) {
            cycle();
            repaint();
            Thread.sleep(10);
        }
    }
}
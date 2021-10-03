import javax.swing.*;
import java.awt.*;

public class Animation extends JPanel {

    int x = 0; // starting position (top left corner)
    int y = 0;

    public void cycle() {
        x += 1; // move 1 pixel each loop (every 10 ms)
        y += 1;
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g); // invoked by swing to draw components - needed for repaint to work
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON); // turn on antialiasing

        g2d.fillOval(x, y, 30, 30); // draw filled oval at top left corner with diameter 30
    }

    public void run() throws InterruptedException {
        for (;;) {
            cycle();
            repaint();
            Thread.sleep(10);
        }
    }
}
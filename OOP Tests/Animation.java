import javax.swing.*;
import java.awt.*;

public class Animation extends JPanel {

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        
        // x, y, width, height, color
        Ball ball1 = new Ball((Graphics2D) g, 1, 1, 50, 50);
        Ball ball2 = new Ball((Graphics2D) g, 51, 1, 50, 50);
    }

    public void run() throws InterruptedException {
        for (;;) {
            repaint();
            Thread.sleep(10);
        }
    }
}

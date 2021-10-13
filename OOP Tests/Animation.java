import javax.swing.*;
import java.awt.*;

public class Animation extends JPanel {

    public Ball[] construct(Graphics g) {
        Ball[] ballList = new Ball[10];

        for (int i = 0; i <= 9; i++) {
            // x, y, width, height, r, g, b
            ballList[i] = new Ball((Graphics2D) g, 1 + (50 * i), 1, 50, 50, 50 + (i * 10), 100, 100);
        }

        return ballList;
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        construct(g);
    }

    public void run() throws InterruptedException {
        for (;;) {
            repaint();
            Thread.sleep(10);
        }
    }
}

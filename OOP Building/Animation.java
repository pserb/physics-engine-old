import javax.swing.*;
import java.awt.*;
import java.util.*;

public class Animation extends JPanel {

    int numBalls = 10;

    public ArrayList<Ball> construct() {

        ArrayList<Ball> balls = new ArrayList<Ball>();

        for (int i = 0; i < numBalls; i++) {

            int dx = new Random().nextInt(900);
            int dy = new Random().nextInt(900);
            int dwidth = 30 + new Random().nextInt(50);
            int dheight = 30 + new Random().nextInt(50);

            balls.add(new Ball(dx, dy, dwidth, dheight));

        }
        return balls;
    }

    ArrayList<Ball> ballList = construct();

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON); // turn on antialiasing

        for (Ball ball : ballList) {
            ball.draw(g2d);
        }

    }

    public void run() throws InterruptedException {
        for (;;) {
            repaint();
            Thread.sleep(10);
        }
    }
}

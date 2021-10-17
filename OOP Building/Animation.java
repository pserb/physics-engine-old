import javax.swing.*;
import java.awt.*;
import java.util.*;

public class Animation extends JPanel {

    int numBalls = 10;

    int time = 0;

    public ArrayList<Ball> construct() {

        ArrayList<Ball> balls = new ArrayList<Ball>();

        for (int i = 0; i < numBalls; i++) {

            int dx = new Random().nextInt(900);
            int dy = new Random().nextInt(400);
            int dwidth = 50;
            int dheight = 50;

            int dr = new Random().nextInt(255);
            int dg = new Random().nextInt(255);
            int db = new Random().nextInt(255);

            int dtranslatex = 0;
            int dtranslatey = 1;

            balls.add(new Ball(dx, dy, dwidth, dheight, dr, dg, db, dtranslatex, dtranslatey));

        }
        return balls;
    }

    ArrayList<Ball> ballList = construct();

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON); // turn on antialiasing

        g2d.fillRect(0, 920, 1000, 50);

        for (Ball ball : ballList) {
            ball.draw(g2d);
            ball.move();
        }

    }

    public void run() throws InterruptedException {
        for (;;) {
            repaint();
            Thread.sleep(10);
            time += 10;
            if (time % 1000 == 0) {
                System.out.println(time/1000);
            }
        }
    }
}

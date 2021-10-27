import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Animation extends JPanel {

    int numBalls = 10;
    int numCubes = 10;

    int time = 0;

    int matches = 0;

    public ArrayList<PhysicsBody> constructBodies() {

        ArrayList<PhysicsBody> bodies = new ArrayList<>();

        for (int i = 0; i < numBalls; i++) {

            int dx = new Random().nextInt(900);
            int dy = new Random().nextInt(200);
            int dwidth = 50;
            int dheight = 50;

            int dr = new Random().nextInt(255);
            int dg = new Random().nextInt(255);
            int db = new Random().nextInt(255);

            float dyvel = (new Random().nextInt(10) - 5) * 4000;
            float dxvel = new Random().nextInt(30) - 15;

            double dbounciness = ThreadLocalRandom.current().nextDouble(0.8, 0.9);

            bodies.add(new Ball(dx, dy, dwidth, dheight, dr, dg, db, dyvel, dxvel, dbounciness));
        }

        for (int i = 0; i < numCubes; i++) {

            int dx = new Random().nextInt(900);
            int dy = new Random().nextInt(200);
            int dwidth = 50;
            int dheight = 50;

            int dr = new Random().nextInt(255);
            int dg = new Random().nextInt(255);
            int db = new Random().nextInt(255);

            float dyvel = (new Random().nextInt(10) - 5) * 4000;
            float dxvel = new Random().nextInt(30) - 15;

            bodies.add(new Cube(dx, dy, dwidth, dheight, dr, dg, db, dyvel, dxvel));
        }

        return bodies;
    }

    ArrayList<PhysicsBody> bodiesList = constructBodies();

    // HashMap<PhysicsBody, Integer> collideMap = new HashMap<>();

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON); // turn on antialiasing

        g2d.fillRect(0, 920, 1000, 50);

        for (PhysicsBody body : bodiesList) {
            body.draw(g2d);
            body.move();
            // body.checkCollision(bodiesList);
        }

    }

    public void run() throws InterruptedException {
        for (;;) {
            repaint();
            Thread.sleep(10);
        }
    }
}

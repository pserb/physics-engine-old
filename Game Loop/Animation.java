import javax.swing.*;
import java.awt.*;

public class Animation extends JPanel {

    int x = 0; // starting position (top left corner)
    int y = 0;

    private void move() {
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

    public static void main(String[] args) throws InterruptedException { // allows threads to interrupt tasks
        JFrame frame = new JFrame("Ball animation"); // initalize view window with title
        Animation animation = new Animation(); // initalize game loop
        frame.add(animation);
        frame.setSize(400,400); // window size 400 x 400
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        while (true) {
            animation.move(); // update x y pos of ball
            animation.repaint(); // paint new pos and delete paint of old pos
            Thread.sleep(10); // loop every 10ms
        }
    }
}
import javax.swing.*;
import java.awt.*;
import java.util.*;

public class Animation extends JPanel {

/* 
    OOPFIY
*/

    public ArrayList<ArrayList<Integer>> ballAttributes() {
        ArrayList<ArrayList<Integer>> attributes = new ArrayList<ArrayList<Integer>>();

        int size = 2;

        for (int i = 0; i < size; i++) {
            attributes.add(new ArrayList<Integer>());
        }

        attributes.get(0).add(new Random().nextInt(500));
        attributes.get(0).add(new Random().nextInt(500));
        attributes.get(0).add(30 + new Random().nextInt(50));
        attributes.get(0).add(30 + new Random().nextInt(50));

        attributes.get(1).add(new Random().nextInt(500));
        attributes.get(1).add(new Random().nextInt(500));
        attributes.get(1).add(30 + new Random().nextInt(50));
        attributes.get(1).add(30 + new Random().nextInt(50));

        return attributes;
    }

    ArrayList<ArrayList<Integer>> params = ballAttributes();

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON); // turn on antialiasing

        /*
        instance.x, instance.y, instance.width, instance.height
        */
        g2d.fillOval(params.get(0).get(0), params.get(0).get(1), params.get(0).get(2), params.get(0).get(3));
        g2d.fillOval(params.get(1).get(0), params.get(1).get(1), params.get(1).get(2), params.get(1).get(3));
        // g2d.fillOval(params.forEach(item -> System.out.println(item)));

    }

    public void run() throws InterruptedException {
        params.forEach(item -> item.forEach(subitem -> System.out.println(subitem)));
        for (;;) {
            repaint();
            Thread.sleep(10);
        }
    }
}

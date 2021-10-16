import java.awt.Graphics2D;
import java.util.*;

public class Ball {

    public int x;
    public int y;
    public int width;
    public int height;

    public Ball(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public void draw(Graphics2D g2d) {
        g2d.fillOval(x, y, width, height);
    }
}

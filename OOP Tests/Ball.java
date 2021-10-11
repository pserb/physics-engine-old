import javax.swing.*;
import java.awt.*;

public class Ball extends JPanel {

    private Graphics2D g2d;
    private int x;
    private int y;
    private int width;
    private int height;
    
    public Ball(Graphics2D g2d, int x, int y, int width, int height) {
        this.g2d = g2d;
        this.x = x;
        this.y = y;
        this.width = width;
        this.width = height;

        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON); // turn on antialiasing
        g2d.fillOval(x, y, width, height);
    }
}
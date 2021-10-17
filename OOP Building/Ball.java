import java.awt.Graphics2D;
import java.util.*;
import java.awt.*;

public class Ball {

    private int x;
    private int y;
    private int width;
    private int height;

    private int r;
    private int g;
    private int b;

    private int translatex;
    private int translatey;

    private int t;
    // public static double gravity;

    public Ball(int x, int y, int width, int height, int r, int g, int b, int translatex, int translatey) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;

        this.r = r;
        this.g = g;
        this.b = b;

        this.translatex = translatex;
        this.translatey = translatey;
    }

    double gravity = -9.81;

    public void move() {
        if (y + height < 920) {
            x += translatex;
            double displacement = -(translatey * 0.5 * gravity * this.t * this.t) / 1000;

            y += (int)displacement;

            if (y + height >= 920) {
                y = 920 - height;
            }

            System.out.println(this.t);
            this.t++;
        }
    }

    public void draw(Graphics2D g2d) {
        g2d.setColor(new Color(r, g, b));
        g2d.fillOval(x, y, width, height);
    }
}

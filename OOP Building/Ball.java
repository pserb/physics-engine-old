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

    public int t;

    private static double gravity = 9.81;
    private float yvel;
    private float xvel;

    private double bounciness;
    private int bounceCounter;

    public Ball(int x, int y, int width, int height, int r, int g, int b, float yvel, float xvel, double bounciness) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;

        this.r = r;
        this.g = g;
        this.b = b;

        this.yvel = yvel;
        this.xvel = xvel;

        this.bounciness = bounciness;
    }

    public void move() {
        x += xvel;

        yvel += gravity * this.t;
        y += yvel / 2000;

        if (y + height + (yvel / 2000) >= 920) {
            yvel = (int)(-yvel * bounciness);
            xvel = (int)(xvel * 0.99);

            bounceCounter++;
        }

        if (x + width >= 982) {
            xvel = (int)(-xvel * 0.95);
        }

        if (x <= 2) {
            xvel = (int)(-xvel * 0.95);
        }

        if (bounceCounter >= 18) {
            y = 920 - height;
            yvel = 0;
        }
        this.t++;
    }

    public void draw(Graphics2D g2d) {
        g2d.setColor(new Color(r, g, b));
        g2d.fillOval(x, y, width, height);
    }
}

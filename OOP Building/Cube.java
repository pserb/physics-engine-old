import java.awt.Graphics2D;
import java.util.*;
import java.awt.*;

public class Cube implements PhysicsBody {

    public int x;
    public int y;
    private int width;
    private int height;

    private int r;
    private int g;
    private int b;

    public int t;

    private static double gravity = 9.81;
    private float yvel;
    private float xvel;

    private int bounceCounter;

    public Cube(int x, int y, int width, int height, int r, int g, int b, float yvel, float xvel) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;

        this.r = r;
        this.g = g;
        this.b = b;

        this.yvel = yvel;
        this.xvel = xvel;
    }

    public int getY() {
        return y; 
    }

    public void bounce() {
        yvel = (int)(-yvel * 0.15);
        xvel = (int)(xvel * 0.99);

        bounceCounter++;
    }

    public void move() {
        x += xvel;

        yvel += gravity * this.t;
        y += yvel / 2000;

        if (y + height + (yvel / 2000) >= 920) {
            bounce();
        }

        if (x + width >= 982) {
            xvel = (int)(-xvel * 0.95);
        }

        if (x <= 2) {
            xvel = (int)(-xvel * 0.95);
        }

        if (bounceCounter >= 50) {
            y = 920 - height;
            yvel = 0;
            xvel = 0;
        }

        this.t++;
    }

    public void draw(Graphics2D g2d) {
        g2d.setColor(new Color(r, g, b));
        g2d.fillRect(x, y, width, height);
    }
    
}

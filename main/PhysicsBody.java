import java.awt.Graphics2D;
import java.util.*;
import java.awt.*;

public interface PhysicsBody {
    // int getX();
    // int getY();
    void bounce();
    void move();
    void draw(Graphics2D g2d);

    // void checkCollision(ArrayList<PhysicsBody> list);
    // void collide();
}
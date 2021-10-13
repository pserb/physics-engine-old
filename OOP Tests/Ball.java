import javax.swing.*;
import java.awt.*;

public class Ball extends JPanel {
    
    public Ball(Graphics2D g2d, int x, int y, int width, int height, int r, int g, int b) {
        
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON); // turn on antialiasing
        g2d.setColor(new Color(r, g, b));
        g2d.fillOval(x, y, width, height);
        
    }
}
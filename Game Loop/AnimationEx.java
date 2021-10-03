import javax.swing.*;
import java.awt.*;

public class AnimationEx extends JFrame {

    public AnimationEx() {
        setup();
    }

    private void setup() {
        setTitle("Ball animation");
        setSize(400,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) throws InterruptedException {
        JFrame execute = new AnimationEx();
        Animation animation = new Animation();
        execute.add(animation);
        execute.setVisible(true);
        animation.run();
    }
}

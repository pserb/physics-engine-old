import javax.swing.*;

public class AnimationEx extends JFrame{
    
    public AnimationEx() {
        setup();
    }

    private void setup() {
        setTitle("OOP Balls");
        setSize(1000,1000);
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

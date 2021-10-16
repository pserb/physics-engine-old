import java.util.*;

public class OOP {

    private int x;
    private int y;
    private int width;
    private int height;

    public OOP(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
    public static void main(String args[]) {
        OOP guy = new OOP(1, 1, 50, 50);

        System.out.println(guy.x);
    }
}
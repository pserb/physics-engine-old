import java.util.Arrays;

public class ArrayTests {

    public static void myArray() {
        int num = 20;

        int[][] array = new int[num][3];

        for (int arraynum=0; arraynum<num; arraynum++) {
            for (int colornum=0; colornum<3; colornum++) {
                array[arraynum][colornum] = (int)(Math.random()*256);
            }
        }
        
        System.out.println(Arrays.deepToString(array));
    }
    public static void main(String args[]) {
        myArray();
    }
}
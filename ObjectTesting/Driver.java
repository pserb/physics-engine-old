import java.util.*;

public class Driver {
	public static void main(String[] args) {
	ArrayList<Object> list = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			list.add(new Object(new Random().nextInt(10), new Random().nextInt(10)));
		}
		
		list.forEach(guy -> System.out.println(guy));
	}
}

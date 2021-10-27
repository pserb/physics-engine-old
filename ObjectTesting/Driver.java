import java.util.*;

public class Driver {

	public static void main(String[] args) {
		
		//==== ArrayList ===//
		ArrayList<Body> list = new ArrayList<>();
		for (int i = 0; i < 20; i++) {
			list.add(new Ball("Ball", new Random().nextInt(10), new Random().nextInt(10)));
			list.add(new Cube("Cube", new Random().nextInt(10), new Random().nextInt(10)));
		}
		
		//==== Check Matches ====//
		int matches = 0;

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));

			for (int j = i + 1; j < list.size(); j++) {
				if (((list.get(i).getX()) == (list.get(j).getX())) && ((list.get(i).getY()) == (list.get(j).getY()))) {
					matches++;
				}
			}
		}
		System.out.println("\nThere are " + matches + " matches.");
	}
}

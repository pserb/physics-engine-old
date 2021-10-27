import java.util.*;

public class Driver {

	public static void main(String[] args) {
		
		//==== ArrayList ===//
		ArrayList<Object> list = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			list.add(new Object(new Random().nextInt(10), new Random().nextInt(10)));
		}
		
		//==== Check Matches ====//
		int matches = 0;

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));

			for (int j = i+1; j < list.size(); j++) {
				if ((list.get(i).equalsX(list.get(j))) && (list.get(i).equalsY(list.get(j)))) {
					matches++;
				}
			}
		}
		System.out.println("\nThere Are: " + matches + " matches.");
	}
}

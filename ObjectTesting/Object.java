public class Object {
	
	int x;
	int y;
	
	public Object(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public boolean equalsX(Object other) {
		return (x == other.x);
	}

	public boolean equalsY(Object other) {
		return (y == other.y);
	}
	
	public String toString() {
		return "(" + x + ", " + y + ")";
	}
}

public class Cube implements Body {
	
    String name;

	int x;
	int y;
	
	public Cube(String name, int x, int y) {
        this.name = name;

		this.x = x;
		this.y = y;
	}

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

	public boolean equalsX(int other) {
		return (x == other);
	}

	public boolean equalsY(Object other) {
		return (y == other.y);
	}
	
	public String toString() {
		return name + " " + "(" + x + ", " + y + ")";
	}
}

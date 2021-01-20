package basic;

class TestOfRectangle {
	public static void main(String[] args) {
		Rectangel r1 = new Rectangel(), r2 = new Rectangel();// creating two objects
		r1.insert(10, 10);
		r2.insert(12, 12);
		r1.calculateArea();
		r2.calculateArea();

	}
}

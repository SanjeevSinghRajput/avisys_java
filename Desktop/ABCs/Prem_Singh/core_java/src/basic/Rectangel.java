package basic;

public class Rectangel {
	int length;
	int width;
//Method for insert 
	void insert(int l, int w) {
		length = l;
		width = w;
	}
     //Method for calculate length and width
	void calculateArea() {
		System.out.println(length * width);
	}
	



}
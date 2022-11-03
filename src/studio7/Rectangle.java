package studio7;

public class Rectangle {
	private int length;
	private int width;

	public Rectangle(int theLength, int theWidth) {
		length=theLength;
		width=theWidth;
	}

	public double Area() {
		double area=length*width;
		return area;
	}

	public double Perimeter() {
		double perimeter=2*length+2*width;
		return perimeter;
	}

	public boolean Compare(int length,int width) {
		double area=length*width;
		if (Area()>area) return true;
		else return false;
	}

	public boolean IsSquare() {
		if (length==width) return true;
		else return false;
	}
	
	public String toString() {
		return "Rectangle [length=" + length + ", width=" + width + "]";
	}

	public static void main(String[] args) {
		Rectangle Rect= new Rectangle(5,3);
		System.out.println(Rect.Area());
		System.out.println(Rect.Perimeter());
		System.out.println(Rect.Compare(4,5));
		System.out.println(Rect.IsSquare());
		System.out.println(Rect);
	}
}



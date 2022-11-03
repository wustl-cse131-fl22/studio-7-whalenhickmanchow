package studio7;

public class Die {
	private int n;

	public Die(int Sides) {
		n=Sides;
	}
	public int Throw() {
		double random=Math.random();
		return (((int)(random*n)*100)/100)+1;
	}
	public String toString() {
		return "Die [n=" + n + "]";
	}
	
	public static void main(String[] args) {
		Die D = new Die(6);
		System.out.print(D.Throw());
	}

}

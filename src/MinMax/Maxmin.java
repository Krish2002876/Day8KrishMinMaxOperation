package MinMax;

public class Maxmin {
	public static void main(String[] args) {
		int x = 4;
		int y = 3;
		int z = 2;
		mathone(x,y,z);
		mathtwo(x,y,z);
		maththree(x,y,z);
		mathfour(x,y,z);
	}
	public static void mathone(int a, int b, int c) {
		int mathonea = (a + b) * c;
		int mathoneb = a + (b * c);
		if (mathonea > mathoneb) {
			System.out.println("Maximum number is "+mathonea+" and Minimum number is "+mathoneb);
		}
		else {
			System.out.println("Maximum number is "+mathoneb+" and Minimum number is "+mathonea);
		}
		
	}
	public static void mathtwo(int a, int b, int c) {
		int mathtwoa = (a + b) / c;
		int mathtwob = a + (b / c);
		if (mathtwoa > mathtwob) {
			System.out.println("Maximum number is "+mathtwoa+" and Minimum number is "+mathtwob);
		}
		else {
			System.out.println("Maximum number is "+mathtwob+" and Minimum number is "+mathtwoa);
		}
		
	}
	public static void maththree(int a, int b, int c) {
		int maththreea = (a % b) + c;
		int maththreeb = a % (b + c);
		if (maththreea > maththreeb) {
			System.out.println("Maximum number is "+maththreea+" and Minimum number is "+maththreeb);
		}
		else {
			System.out.println("Maximum number is "+maththreeb+" and Minimum number is "+maththreea);
		}
		
	}
	public static void mathfour(int a, int b, int c) {
		int mathfoura = (a * b) + c;
		int mathfourb = a * (b + c);
		if (mathfoura > mathfourb) {
			System.out.println("Maximum number is "+mathfoura+" and Minimum number is "+mathfourb);
		}
		else {
			System.out.println("Maximum number is "+mathfourb+" and Minimum number is "+mathfoura);
		}
		
	}






}
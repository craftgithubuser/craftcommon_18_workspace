package CraftFs;

public class Sum {

	public static void main(String[] args) {
       int a = 7;
       int b= 10;
       int sum;
       double z=  Div(100.4, 20.2);
       System.out.println(z);
       double y=  Div(2500.4, 2.2);
       System.out.println(y);
       
       
       sum= a+b;
       System.out.println(sum);
       System.out.println("Java");

	}
	public static double Div(double a, double b) {
		
		double z;
		z=  a/b;
		
		return z;
		
	}

}

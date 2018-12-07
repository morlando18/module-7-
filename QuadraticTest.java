import java.util.Scanner;
//9.10
public class QuadraticTest {
	public static void main(String[] args){
		//inputs 
		System.out.print("Enter a, b, c: ");
		Scanner input = new Scanner(System.in);
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		
		QuadraticEquation e = new QuadraticEquation(a, b, c);
		// checking discriminant if positive, 0, or negative
		if(e.getDiscriminant() > 0){
			System.out.println("The equation has two roots " + e.getRoot1() + " and " + e.getRoot2());
		}else if (e.getDiscriminant() == 0){
			System.out.println("The equation has one root " + e.getRoot1());
		}else {
			System.out.println("The equation has no real roots");
		}
		input.close();
	}
}

class QuadraticEquation {
	private double a, b, c;
	
	public QuadraticEquation(double a, double b, double c){
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public double getA(){
		return a;
	}
	public double getB(){
		return b;
	}
	public double getC(){
		return c;
	}
	public double getDiscriminant(){
		return b * b - 4 * a * c;
	}
	public double getRoot1(){
		if(getDiscriminant() < 0){
			return 0;
		}else{
			return (-b + Math.pow(getDiscriminant(), 0.5)) / (2 * a);
		}
	}
	public double getRoot2(){
		if(getDiscriminant() < 0){
			return 0;
		}else{
			return (-b - Math.pow(getDiscriminant(), 0.5)) / (2 * a);
		}
	}
}

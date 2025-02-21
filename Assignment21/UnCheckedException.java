import java.util.*;

class UnCheckedException{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		try{
			System.out.println("Enter 1 Number:");
			int num1 = sc.nextInt();
			System.out.println("Enter 2 Number:");
			int num2 = sc.nextInt();
			int divide = num1/num2;
			System.out.println("Divide: "+divide);
		}
		catch(ArithmeticException e){
			System.out.println("Please Dont Enter 0 in Denominator.");
		}
		catch(InputMismatchException e){
			System.out.println("Please Enter only Numeric Values.");
		}
	}
}
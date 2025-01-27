import java.util.*;

public class SimpleInterest {
    public double calculateSimpleInterest(double Principal, double Rate, double Time) {
        return (Principal * Rate * Time) / 100; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principal: ");
        double Principal = sc.nextDouble();

        System.out.print("Enter Rate of Interest: ");
        double Rate = sc.nextDouble();

        System.out.print("Enter Time: ");
        double Time = sc.nextDouble();

        SimpleInterest obj = new SimpleInterest();
        double simpleInterest = obj.calculateSimpleInterest(Principal, Rate, Time);

        System.out.println("The Simple Interest is " + simpleInterest + " for Principal " + Principal + ", Rate of Interest " + Rate + " and Time " + Time + ".");
    }
}

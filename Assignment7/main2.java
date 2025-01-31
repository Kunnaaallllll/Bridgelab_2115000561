import java.util.*;
public class main2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        double radius = sc.nextDouble();
        Circle cr = new Circle(radius);
        cr.calculate();
        cr.displayDetails();
    }
}

import java.util.*;
public class Volume {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        double radius = sc.nextDouble();
        System.out.print("Enter the height: ");
        double height = sc.nextDouble();
        double volume = (22.0 / 7) * radius * radius * height;
        System.out.println("Volume: " + volume);
    }     
        
}

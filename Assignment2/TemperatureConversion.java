import java.util.Scanner;
class TemperatureConversion {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter temperature in Celsius: ");
       double celsius = sc.nextDouble();
       double fahrenheitResult = (celsius * 9/5) + 32;
       System.out.println(celsius + " Celsius is " + fahrenheitResult + " Fahrenheit");
   }
}

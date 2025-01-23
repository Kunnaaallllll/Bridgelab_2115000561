import java.util.Scanner;
class FeeCalculator {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the student fee: ");
       double fee = sc.nextDouble();
       System.out.print("Enter the discount percentage: ");
       double discountPercent = sc.nextDouble();
       double discountAmount = (discountPercent/100) * fee;
       double discountedFee = fee-discountAmount;
       System.out.println("The discount amount is INR " +discountAmount+ " and final discounted fee is INR " +discountedFee);
   }
}

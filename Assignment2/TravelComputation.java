import java.util.Scanner;
class TravelComputation {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter your name: ");
       String name = sc.nextLine();
       System.out.print("Enter the name of the city you are traveling from: ");
       String fromCity = sc.nextLine();
       System.out.print("Enter the name of the city you are traveling via: ");
       String viaCity = sc.nextLine();
       System.out.print("Enter the name of the city you are traveling to: ");
       String toCity = sc.nextLine();
       System.out.print("Enter the distance from " + fromCity + " to " + viaCity + " in miles: ");
       double distanceFromToVia = sc.nextDouble();
       System.out.print("Enter the time taken to travel from " + fromCity + " to " + viaCity + " in minutes: ");
       int timeFromToVia = sc.nextInt();
       System.out.print("Enter the distance from " + viaCity + " to " + toCity + " in miles: ");
       double distanceViaToFinalCity = sc.nextDouble();
       System.out.print("Enter the time taken to travel from " + viaCity + " to " + toCity + " in minutes: ");
       int timeViaToFinalCity = sc.nextInt();
       double totalDistance = distanceFromToVia + distanceViaToFinalCity;
       int totalTime = timeFromToVia + timeViaToFinalCity;
       System.out.println("The Total Distance travelled by " + name + " from " + fromCity + " to " + toCity + " via " + viaCity +
               " is " + totalDistance + " miles and the Total Time taken is " + totalTime + " minutes.");
   }
}

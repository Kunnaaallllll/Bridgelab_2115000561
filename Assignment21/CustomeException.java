import java.util.*;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}
public class CustomeException {
    static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above.");
        }
        System.out.println("It is a Valid Age");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.print("Enter the Age: ");
            int age = sc.nextInt();
            validateAge(age);
        }
        catch (InvalidAgeException e){
            System.out.println(e.getMessage());
        }
        catch (InputMismatchException e){
            System.out.println("Enter Numeric Value Only.");
        }
    }
}

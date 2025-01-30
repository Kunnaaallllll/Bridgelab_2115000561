import java.util.Scanner;

public class RemoveCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.print("Enter the character to remove: ");
        char chToRemove = sc.next().charAt(0);
        sc.close();

        String modifiedStr = removeCharacter(str, chToRemove);
        System.out.println("Modified String: " + modifiedStr);
    }

    public static String removeCharacter(String str, char chToRemove) {
        String result = "";
        for (char ch : str.toCharArray()) {
            if (ch != chToRemove) {
                result += ch;
            }
        }
        return result;
    }
}

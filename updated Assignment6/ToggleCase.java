import java.util.Scanner;

class ToggleCase {
    static String toggleCase(String word) {
        String result = "";
        
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            
            if (Character.isUpperCase(ch)) {
                result += Character.toLowerCase(ch);
            } else if (Character.isLowerCase(ch)) {
                result += Character.toUpperCase(ch);
            } else {
                result += ch;
            }
        }
        
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String word = sc.nextLine();

        System.out.println("Toggled String: " + toggleCase(word));

        sc.close();
    }
}

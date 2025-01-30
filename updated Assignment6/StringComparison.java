import java.util.Scanner;

class StringComparison {
    static int compareStrings(String first, String second) {
        int length = Math.min(first.length(), second.length());

        for (int i = 0; i < length; i++) {
            if (first.charAt(i) != second.charAt(i)) {
                return first.charAt(i) - second.charAt(i);
            }
        }

        return first.length() - second.length();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String first = sc.nextLine();

        System.out.print("Enter second string: ");
        String second = sc.nextLine();

        int result = compareStrings(first, second);

        if (result < 0) {
            System.out.println('"' + first + "\" comes before \"" + second + "\" in lexicographical order");
        } else if (result > 0) {
            System.out.println('"' + first + "\" comes after \"" + second + "\" in lexicographical order");
        } else {
            System.out.println("Both strings are equal");
        }

        sc.close();
    }
}

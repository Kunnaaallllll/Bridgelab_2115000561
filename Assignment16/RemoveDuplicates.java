import java.util.*;
public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(removeDuplicate(str));
    }
    public static String removeDuplicate(String str){
        HashSet<Character> hs=new HashSet<>();
        StringBuilder stb=new StringBuilder();
        for(char ch :str.toCharArray()){
            if(!hs.contains(ch)){
                stb.append(ch);
            }
            hs.add(ch);
        }
        return stb.toString();
    }
}
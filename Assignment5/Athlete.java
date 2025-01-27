import java.util.Scanner;
public class Athlete{
    public static void main(String [] Args){
        Scanner sc=new Scanner(System.in);
        int side1=sc.nextInt();
        int side2=sc.nextInt();
        int side3=sc.nextInt();
        int perimeter=side1+side2+side3;
        int distance=5;
        Athlete at=new Athlete();
        System.out.println(at.round(perimeter,distance));

    }
    public int round(int perimeter,int distance){
        int Round=distance/perimeter;
        return Round;
    }
}
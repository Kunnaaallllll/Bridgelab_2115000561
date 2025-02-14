public class SortStudentAges{
public static void main(String[]args){
int[]ages={12,15,11,18,14,10,13,17,16,12,15};
int max=18,min=10;
int[]count=new int[max-min+1];
for(int i=0;i<ages.length;i++)count[ages[i]-min]++;
int index=0;
for(int i=0;i<count.length;i++){
while(count[i]-->0)ages[index++]=i+min;
}
for(int i=0;i<ages.length;i++){
System.out.print(ages[i]+" ");
}
}
}

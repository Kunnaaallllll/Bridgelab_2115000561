public class SortExamScores{
public static void main(String[]args){
int[]scores={78,90,65,88,76,92};
for(int i=0;i<scores.length-1;i++){
int min=i;
for(int j=i+1;j<scores.length;j++){
if(scores[j]<scores[min])min=j;
}
int temp=scores[i];
scores[i]=scores[min];
scores[min]=temp;
}
for(int i=0;i<scores.length;i++){
System.out.print(scores[i]+" ");
}
}
}

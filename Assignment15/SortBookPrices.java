public class SortBookPrices{
public static void main(String[]args){
int[]prices={450,200,700,150,600,300};
mergeSort(prices,0,prices.length-1);
for(int i=0;i<prices.length;i++){
System.out.print(prices[i]+" ");
}
}
static void mergeSort(int[]arr,int left,int right){
if(left<right){
int mid=left+(right-left)/2;
mergeSort(arr,left,mid);
mergeSort(arr,mid+1,right);
merge(arr,left,mid,right);
}
}
static void merge(int[]arr,int left,int mid,int right){
int n1=mid-left+1,n2=right-mid;
int[]L=new int[n1],R=new int[n2];
for(int i=0;i<n1;i++)L[i]=arr[left+i];
for(int i=0;i<n2;i++)R[i]=arr[mid+1+i];
int i=0,j=0,k=left;
while(i<n1&&j<n2){
if(L[i]<=R[j])arr[k++]=L[i++];
else arr[k++]=R[j++];
}
while(i<n1)arr[k++]=L[i++];
while(j<n2)arr[k++]=R[j++];
}
}

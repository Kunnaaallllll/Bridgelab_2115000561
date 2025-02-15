public class RotationPoint {
    public static void main(String[] args) {
        int arr[]={4,5,6,7,1,2,3};
        System.out.println(findPoint(arr));
    }
    public static int findPoint(int arr[]){
        int left =0;
        int right=arr.length-1;
        while(left<right){
        int mid=(left+right)/2;
            if(arr[mid]>arr[right]){
                left=mid+1;
            }else{
                right=mid;
            }
        }
        return left;
    }
}

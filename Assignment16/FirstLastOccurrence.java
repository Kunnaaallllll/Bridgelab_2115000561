public class FirstLastOccurrence {
    public static void main(String[] args) {
        int arr[]={1, 2, 2, 2, 3, 4, 5};
        int target=2;
        System.out.println(findFirstOccurrence(arr, target)+" "+findLastOccurrence(arr, target));
    }
    public static int findFirstOccurrence(int arr[], int target){
        int left=0, right=arr.length-1, first=-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(arr[mid]==target){
                first=mid;
                right=mid-1;
            }else if(arr[mid]<target){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return first;
    }
    public static int findLastOccurrence(int arr[], int target){
        int left=0, right=arr.length-1, last=-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(arr[mid]==target){
                last=mid;
                left=mid+1;
            }else if(arr[mid]<target){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return last;
    }
}

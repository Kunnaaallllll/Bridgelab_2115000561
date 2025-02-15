public class PeakElement {
    public static void main(String[] args) {
        int arr[]={1, 3, 2, 4, 1, 7, 5};
        System.out.println(findPeakElement(arr));
    }
    public static int findPeakElement(int arr[]){
        int left =0;
        int right=arr.length-1;
        while(left<right){
            int mid=(left+right)/2;
            if(arr[mid]>arr[mid-1] && arr[mid] >arr[mid+1]) {
                return arr[mid];
            }
            if(arr[mid]<arr[mid-1]){
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return arr[left];
    }
}

public class FirstMissingPositive {
    public static void main(String[] args) {
        int arr[]={3, 4, -1, 1};
        System.out.println(findFirstMissingPositive(arr));
    }
    public static int findFirstMissingPositive(int arr[]){
        int n = arr.length;
        boolean present[] = new boolean[n+1];
        for(int i=0; i<n; i++){
            if(arr[i]>0 && arr[i]<=n){
                present[arr[i]] = true;
            }
        }
        for(int i=1; i<=n; i++){
            if(!present[i]){
                return i;
            }
        }
        return n+1;
    }
}

import java.util.*;

class CompareSortingAlgo{
	public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }
	public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }
	public static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1, n2 = right - mid;
        int[] L = new int[n1], R = new int[n2];
        System.arraycopy(arr, left, L, 0, n1);
        System.arraycopy(arr, mid + 1, R, 0, n2);

        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) arr[k++] = (L[i] <= R[j]) ? L[i++] : R[j++];
        while (i < n1) arr[k++] = L[i++];
        while (j < n2) arr[k++] = R[j++];
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }
	public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high], i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }
	public static void main(String[]args){
		int N = 1000;
		Random rand = new Random();
		int arr1[] = new int[N];
		int arr2[] = new int[N];
		int arr3[] = new int[N];
		for (int i = 0; i < N; i++){ 
			arr1[i] = rand.nextInt(N);
			arr2[i] = rand.nextInt(N);
			arr3[i] = rand.nextInt(N);
		}
		
		long bubbleStart = System.nanoTime();
        bubbleSort(arr1);
		long bubbleEnd = System.nanoTime();
        System.out.println("Bubble Sort Time Taken: " + (bubbleEnd - bubbleStart)/1e6 + " ms");
		
		long mergeStart = System.nanoTime();
        mergeSort(arr2,0, arr2.length - 1);
		long mergeEnd = System.nanoTime();
        System.out.println("Merge Sort Time Taken: " + (mergeEnd - mergeStart)/1e6 + " ms");
		
		long quickStart = System.nanoTime();
        quickSort(arr3, 0, arr3.length - 1);
		long quickEnd = System.nanoTime();
        System.out.println("Quick Sort Time Taken: " + (quickEnd - quickStart)/1e6 + " ms");
	}
}
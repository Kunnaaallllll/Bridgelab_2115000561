import java.util.*;

class CompareDataStructure{
	public static void main(String[]args){
		int dataSet_Size = 1000000;
		int target = dataSet_Size-1;
		
		int arr[] = new int[dataSet_Size];
		HashSet<Integer> hs = new HashSet<>();
		TreeSet<Integer> ts = new TreeSet<>();
		
		for(int i=0; i< dataSet_Size; i++){
			arr[i] = i;
			hs.add(i);
			ts.add(i);
		}
		
		long arrayStart = System.nanoTime();
		long arrayEnd = 0;
		for(int i : arr)
			if(i == target)
				arrayEnd = System.nanoTime();
		System.out.println("Array Time Taken: "+(arrayEnd-arrayStart)+1e6+" ms.");
		
		long hsStart = System.nanoTime();
		hs.contains(target);
		long hsEnd = System.nanoTime();
		System.out.println("HashSet Time Taken: "+(hsEnd-hsStart)+1e6+" ms.");
		
		long tsStart = System.nanoTime();
		ts.contains(target);
		long tsEnd = System.nanoTime();
		System.out.println("TreeSet Time Taken: "+(tsEnd-tsStart)+1e6+" ms.");

	}
}
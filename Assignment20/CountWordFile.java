import java.io.*;
import java.util.*;

class CountWordFile{
	public static void main(String[]args){
		String path = "readFile.txt";
        Map<String, Integer> count = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String l;
            while ((l = br.readLine()) != null) {
                String[] words = l.toLowerCase().replaceAll("[^a-zA-Z ]", "").split("\\s+");
                for (String w : words) {
                    if (!w.isEmpty()) {
                        count.put(w, count.getOrDefault(w, 0) + 1);
                    }
                }
            }
        } 
		catch (Exception e) {
            System.out.println(e);
        }
		
		List<Map.Entry<String, Integer>> list = new ArrayList<>(count.entrySet());
		list.sort((a,b)->b.getValue().compareTo(a.getValue()));
		
		System.out.println("Most Frequent Words:");
		for (int i = 0; i < Math.min(5, list.size()); i++) {
			System.out.println(list.get(i).getKey() + " -> " + list.get(i).getValue());
		}
	}
}
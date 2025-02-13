import java.util.*;
class CustomHashMap {
    private static class Node {
        int key, value;
        Node(int k, int v) { key = k; value = v; }
    }

    private final int SIZE = 1000;
    private List<Node>[] map = new List[SIZE];

    private int hash(int key) { return key % SIZE; }

    public void put(int key, int value) {
        int idx = hash(key);
        if (map[idx] == null) map[idx] = new ArrayList<>();
        for (Node node : map[idx]) {
            if (node.key == key) { node.value = value; return; }
        }
        map[idx].add(new Node(key, value));
    }

    public int get(int key) {
        int idx = hash(key);
        if (map[idx] != null) {
            for (Node node : map[idx]) 
                if (node.key == key) return node.value;
        }
        return -1;
    }

    public void remove(int key) {
        int idx = hash(key);
        if (map[idx] != null) 
            map[idx].removeIf(node -> node.key == key);
    }

    public static void main(String[] args) {
        CustomHashMap map = new CustomHashMap();
        map.put(1, 10);
        map.put(2, 20);
        System.out.println(map.get(1));
        map.remove(1);
        System.out.println(map.get(1));
    }
}
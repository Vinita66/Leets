import java.util.LinkedList;

class MyHashMap {

    private static class Node {
        int key, value;
        Node(int k, int v) { key = k; value = v; }
    }

    private static final int SIZE = 10000; 
    private LinkedList<Node>[] map;

    public MyHashMap() {
        map = new LinkedList[SIZE];
    }
    
    public void put(int key, int value) {
        int i = key % SIZE;
        if (map[i] == null) map[i] = new LinkedList<>();

        for (Node n : map[i]) {
            if (n.key == key) {
                n.value = value;
                return;
            }
        }
        map[i].add(new Node(key, value));
    }
    
    public int get(int key) {
        int i = key % SIZE;
        if (map[i] == null) return -1;

        for (Node n : map[i])
            if (n.key == key) return n.value;

        return -1;
    }
    
    public void remove(int key) {
        int i = key % SIZE;
        if (map[i] == null) return;

        map[i].removeIf(n -> n.key == key);
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */
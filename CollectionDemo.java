// ---------------- COLLECTION FRAMEWORK DEMO ----------------
//
// Collection Framework = Ready-made classes & interfaces for data storage and manipulation
//
// Main interfaces:
// 1) List   -> Ordered, allows duplicate elements (ArrayList, LinkedList, Vector, Stack)
// 2) Set    -> Unordered, unique elements (HashSet, LinkedHashSet, TreeSet)
// 3) Queue  -> FIFO (LinkedList, PriorityQueue)
// 4) Map    -> Key-Value pair (HashMap, LinkedHashMap, TreeMap, Hashtable)
//
// Inbuilt methods: add(), remove(), contains(), size(), iterator(), get(), etc.
//
// Niche example me sabka use karke samjhaya gaya hai.
//

import java.util.*;

public class CollectionDemo {
    public static void main(String[] args) {

        // ---------------- LIST (Allows Duplicates, Maintains Order) ----------------
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Mango");
        list.add("Banana"); // duplicate allowed
        System.out.println("List (ArrayList): " + list);
        System.out.println("Get element at index 2: " + list.get(2));

        // ---------------- LINKEDLIST ----------------
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("One");
        linkedList.add("Two");
        linkedList.addFirst("Zero");
        System.out.println("LinkedList: " + linkedList);

        // ---------------- VECTOR ----------------
        Vector<Integer> vector = new Vector<>();
        vector.add(10);
        vector.add(20);
        vector.add(30);
        System.out.println("Vector: " + vector);

        // ---------------- STACK ----------------
        Stack<String> stack = new Stack<>();
        stack.push("Book1");
        stack.push("Book2");
        stack.push("Book3");
        System.out.println("Stack before pop: " + stack);
        stack.pop(); // removes top
        System.out.println("Stack after pop: " + stack);

        // ---------------- SET (No Duplicates) ----------------
        Set<Integer> set = new HashSet<>();
        set.add(100);
        set.add(200);
        set.add(100); // duplicate ignored
        System.out.println("Set (HashSet): " + set);

        // ---------------- LINKEDHASHSET ----------------
        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("C");
        linkedHashSet.add("A");
        linkedHashSet.add("B");
        linkedHashSet.add("A"); // duplicate ignored
        System.out.println("LinkedHashSet (Order maintained): " + linkedHashSet);

        // ---------------- TREESET ----------------
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(50);
        treeSet.add(10);
        treeSet.add(30);
        treeSet.add(10); // duplicate ignored
        System.out.println("TreeSet (Sorted): " + treeSet);

        // ---------------- QUEUE (FIFO) ----------------
        Queue<String> queue = new LinkedList<>();
        queue.add("Task1");
        queue.add("Task2");
        queue.add("Task3");
        System.out.println("Queue: " + queue);
        queue.remove(); // removes head
        System.out.println("Queue after remove: " + queue);

        // ---------------- PRIORITYQUEUE ----------------
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(40);
        pq.add(10);
        pq.add(30);
        System.out.println("PriorityQueue (Sorted automatically): " + pq);

        // ---------------- MAP (Key-Value) ----------------
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Red");
        map.put(2, "Green");
        map.put(3, "Blue");
        map.put(2, "Yellow"); // duplicate key override
        System.out.println("Map (HashMap): " + map);
        System.out.println("Value at key 2: " + map.get(2));

        // ---------------- LINKEDHASHMAP ----------------
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("A", 100);
        linkedHashMap.put("B", 200);
        linkedHashMap.put("C", 300);
        System.out.println("LinkedHashMap (Order maintained): " + linkedHashMap);

        // ---------------- TREEMAP ----------------
        Map<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Banana", 40);
        treeMap.put("Apple", 20);
        treeMap.put("Mango", 60);
        System.out.println("TreeMap (Sorted by key): " + treeMap);

        // ---------------- ITERATOR ----------------
        Iterator<String> it = list.iterator();
        System.out.print("Iterating List: ");
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();
    }
}

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<Integer> ll1 = new LinkedList<Integer>();
        ll1.add(20);
        ll1.add(30);
        ll1.addFirst(10);
        ll1.addLast(40);
        System.out.println("\nFirst Element: " + ll1.getFirst());
        System.out.println("\nLast Element: " + ll1.getLast());
        System.out.println("\nList: " + ll1);
    }
}

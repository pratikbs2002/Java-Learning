import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * ArrayListExample
 */
public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        ArrayList<Integer> arrayList2 = new ArrayList<>(List.of(1, 2, 3, 4));
        arrayList1.add(10);
        arrayList1.add(20);
        arrayList1.add(30);
        arrayList1.add(40);
        arrayList1.add(50);
        arrayList1.addAll(0, arrayList2);
        System.out.println(arrayList1);
        System.out.println("Check : Element Present in ArrayList = " + arrayList1.contains(290));
        System.out.println("Check : Element Present in ArrayList = " + arrayList1.contains(20));
        System.out.println("Get(index) : " + arrayList1.get(8));
        System.out.println("IndexOf : " + arrayList1.indexOf(10));
        System.out.println("LastIndexOf : " + arrayList1.lastIndexOf(10));
        System.out.println("set : " + arrayList1.set(4, 80));
        System.out.println(arrayList1);
        System.out.println("set : " + arrayList1.set(4, 10));

        for (int i = 0; i < arrayList1.size(); i++) {
            System.out.println("Element " + i + " : " + arrayList1.get(i));
        }
        System.out.print("\nAccess using foreach loop : ");
        for (Integer i : arrayList1) {
            System.out.print(i + ", ");
        }
        System.out.print("\n\nAccess using Iterator : ");

        for (Iterator<Integer> i = arrayList1.iterator(); i.hasNext();) {
            Integer el = i.next();
            System.out.print(el + ", ");
        }

        System.out.print("\n\nAccess using Iterator While Loop : ");

        Iterator<Integer> it = arrayList1.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + ", ");
        }

        System.out.print("\n\nAccess using forEach Loop : ");
        arrayList1.forEach(n -> printList(n));
    }

    static void printList(int n) {
        if (n < 10)
            System.out.print(n + ", ");
    }
}
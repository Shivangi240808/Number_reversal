import java.util.*;

class Ts {
    public static void main(String args[]) {
        TreeSet<Integer> ts = new TreeSet<Integer>();
        ts.add(1);
        ts.add(2);
        ts.add(3);
        ts.add(2);
        System.out.println("List of elements" + ts);
        ts.remove(3);
        System.out.println("New List" + ts);
        TreeSet<Integer> ts1 = new TreeSet<Integer>();
        ts1.add(6);
        ts1.add(4);
        ts.addAll(ts1);
        System.out.println(ts);
        ts.removeAll(ts1);
        System.out.println(ts);
        ts.clear();
        System.out.println("Final List" + ts);

    }
}
package Solution11_9_7;

import Solution11_7_1.Product;

import java.util.Comparator;
import java.util.TreeSet;

public class Sorted implements Comparable<Sorted>, Comparator<Sorted> {
    private int num;
    private String text;

    public Sorted(int num, String text) {
        this.num = num;
        this.text = text;
    }

    @Override
    public String toString() {
        return "" + num;
    }

    @Override
    public int compareTo(Sorted o) {        // отрабатывает  implements Comparable<Sorted>
        return text.compareTo(o.text);
    }

    @Override
    public int compare(Sorted o1, Sorted o2) {  //отрабатывает  implements Comparator<Sorted>
        return o1.num - o2.num; // знак "-" меняет местами очередность вывода коллекции
    }

    public static void main(String[] args) {
        Sorted s1 = new Sorted(88, "a");
        Sorted s2 = new Sorted(55, "b");
        TreeSet<Sorted> t1 = new TreeSet<>();
        t1.add(s1);
        t1.add(s2);

        TreeSet<Sorted> t2 = new TreeSet<>(s1);
        t2.add(s1);
        t2.add(s2);
        System.out.println(t1 + " " + t2);
    }
}

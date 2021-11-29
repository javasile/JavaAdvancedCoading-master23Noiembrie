package Class24Noiembrie;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Average medie = new Average ();
        List<Integer> list = new ArrayList<> ();

        list.add (4);
        list.add (5);
        list.add (6);
        list.add (7);
        list.add (3);

        System.out.println (medie.average (list));

    }
}

package Class24Noiembrie;

import java.util.List;

public class Average {
    public Double average(List<Integer> list) {
//        return list.stream ().mapToDouble (value -> value).average ().getAsDouble ();
            // mapToDouble transforma stringul in double
            // pentru a putea scoate valoarea rezultata.

        return list.stream ()
//                .reduce ((sum, number) -> Integer.sum (sum, number))
                // Metoda2
                .reduce (Integer::sum) //Metoda3
                .get ()/(double)list.size ();

    }
}

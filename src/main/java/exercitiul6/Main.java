package exercitiul6;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList (3, 4);
        System.out.println ( StringTransformer.getStringTransformer ().transformString (list));
    }
}

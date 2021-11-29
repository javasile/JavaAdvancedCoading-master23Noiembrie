package exercitiul6;

import java.util.List;

public class StringTransformer {

    private static final StringTransformer stringTransformer = new StringTransformer ();

    private StringTransformer() {

    }

    public static StringTransformer getStringTransformer() {
        return stringTransformer;
    }

    public String transformString(List<Integer> list) {
        if (list == null){
            return "";
        }

        return list.stream ().map (number -> {
            if (number % 2 == 0) {
                return "e" + number;
            }
            return "o" + number;
        }).reduce ((result, item) -> result + "," + item).orElse ("");
    }

}

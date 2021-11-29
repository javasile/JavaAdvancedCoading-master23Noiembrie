package exercitiul1;

public class ReverseString implements Reverseble<String,Integer> {
    @Override
    public Integer reverseNumber(String number) {
        return Integer.parseInt(new StringBuilder().append(number).reverse().toString());
    }
}

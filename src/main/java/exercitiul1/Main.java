package exercitiul1;

public class Main {
    public static void main(String[] args) {
        Read read = new Read();
        Reverseble<Integer,Integer> reverse = new Reverse();
        System.out.println(reverse.reverseNumber(read.read()));
        Reverseble<String,Integer> reverse2 = new ReverseString();
        System.out.println(reverse2.reverseNumber(String.valueOf(read.read())));
    }
}

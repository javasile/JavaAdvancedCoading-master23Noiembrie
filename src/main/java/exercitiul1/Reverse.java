package exercitiul1;

public class Reverse implements Reverseble<Integer,Integer> {


    @Override
    public Integer reverseNumber(Integer number) {
        int ultimaCifra;
        int reversedNumber = 0;

        while( number != 0 ){
            ultimaCifra = number % 10;
            reversedNumber = reversedNumber * 10 + ultimaCifra;
            number /= 10;
        }
        return reversedNumber;
    }

}

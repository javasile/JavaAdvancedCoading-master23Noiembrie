package exercitiu10;

import java.util.Random;

public class Suplaier {
    double getPriceForProduct(GenerricProduct product){
        Random r = new Random ();
        double numar = r.nextDouble ();


        return numar * product.getId ();
    }
}

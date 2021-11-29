package exercitiu10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Basket {

    Map<Integer, Integer> cantitatiProduse = new HashMap<> ();

    private final List<Product> products = new ArrayList<> ();

    public void addItem(Product produs, int cantitate) {

        if (products.contains (produs.equals (produs.getId ()))) {remuveItem (produs, cantitate);

        }
        products.add (produs);
        cantitatiProduse.put (produs.getId (), cantitate);

    }

    public void remuveItem(Product produs, int id) {
        products.removeIf (product -> product.getId () == id);
    }

    public List<Product> getProducts() {

        List<Product> list = new ArrayList<> (products);
        return list;
    }
}

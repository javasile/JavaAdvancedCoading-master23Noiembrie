package exercitiu10;

import java.time.LocalDate;
import java.util.Date;

public interface Product {
    double getPrice();
    int getId();
    boolean getAvailability(LocalDate date);

}

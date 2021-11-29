package exercitiu10;

import java.time.LocalDate;
import java.util.Date;

public class GenerricProduct implements Product {

    double price;
    LocalDate availabilityDate;
    Suplaier suplaier;
    String nume;
    final int id;

    public GenerricProduct(double price, LocalDate availabilityDate, String nume, int id) {
        this.price = suplaier.getPriceForProduct (this);
        this.availabilityDate = availabilityDate;
        this.nume = nume;
        this.id = id;
        this.suplaier = suplaier;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Suplaier getSuplaier() {
        return suplaier;
    }

    public void setSuplaier(Suplaier suplaier) {
        this.suplaier = suplaier;
    }

    public LocalDate getAvailabilityDate() {
        return availabilityDate;
    }

    public void setAvailabilityDate(LocalDate availabilityDate) {
        this.availabilityDate = availabilityDate;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getId() {
        return id;
    }


    @Override
    public double getPrice() {
        return 0;
    }

    @Override
    public boolean getAvailability(LocalDate date) {
        return false;
    }
}

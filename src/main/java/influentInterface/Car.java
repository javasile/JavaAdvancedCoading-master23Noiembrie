package influentInterface;

public class Car {

    String color;
    String name;
    double price;

    public Car(String color, String name, double price) {
        this.color = color;
        this.name = name;
        this.price = price;
    }

    public Car() {

    }

    public String getColor() {
        return color;
    }

    public Car setColor(String color) {
        this.color = color;
        return this;
    }

    public String getName() {
        return name;
    }

    public Car setName(String name) {
        this.name = name;
        return this;
    }

    public double getPrice() {
        return price;
    }

    public Car setPrice(double price) {
        this.price = price;
        return this;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

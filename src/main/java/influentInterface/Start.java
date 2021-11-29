package influentInterface;

public class Start {
    public static void main(String[] args) {
        Car car = new Car ();
        car.setColor ("gray").setName ("BMW").setPrice (231535.32);
        System.out.println (car.toString ());

    }
}

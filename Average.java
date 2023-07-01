import java.util.ArrayList;

public class Average{
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);

        cars.set(0, "Jeep");
        System.out.println(cars);
    }
}
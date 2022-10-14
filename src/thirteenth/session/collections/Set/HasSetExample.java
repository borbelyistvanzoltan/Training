package thirteenth.session.collections.Set;

import java.util.HashSet;

public class HasSetExample {

    public static void main(String[] args) {
        HashSet<String> cars = new HashSet();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");

        // It contains unique items
        cars.add("Volvo");

        System.out.println(cars);

        cars.add("Opel");

        System.out.println(cars);

        cars.add("BMW");

        System.out.println(cars);
    }
}

package thirteenth.session.collections.Set;

import java.util.LinkedHashSet;

public class LinkedHasSetExample {

    public static void main(String[] args) {
        LinkedHashSet<String> cars = new LinkedHashSet();
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

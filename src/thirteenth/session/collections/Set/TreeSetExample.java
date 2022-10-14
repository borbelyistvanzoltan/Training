package thirteenth.session.collections.Set;

import java.util.TreeSet;

public class TreeSetExample {

    public static void main(String[] args) {
        TreeSet<String> cars = new TreeSet<>();
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


        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(4);
        numbers.add(13);
        numbers.add(1);

        System.out.println(numbers);

    }
}

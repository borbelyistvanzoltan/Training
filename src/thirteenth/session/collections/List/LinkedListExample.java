package thirteenth.session.collections.List;

import java.util.LinkedList;

public class LinkedListExample {

    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");

        System.out.println(cars);

        // Use addFirst() to add the item to the beginning
        cars.addFirst("Mazda");
        System.out.println(cars);

        cars.add("Mustang");
        System.out.println(cars);


    }
}

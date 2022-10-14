package thirteenth.session.collections.List;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {

    public static void main(String args[]){
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        System.out.println(cars);

        System.out.println(cars.size());

        System.out.println(cars.get(0));

        cars.set(0, "Opel");

        System.out.println(cars.get(0));

        System.out.println(cars);

        cars.remove(0);

        System.out.println(cars);

        cars.clear();

        System.out.println(cars);

        cars.add("Ferrari");
        cars.add("Aston Martin");
        cars.add("Bentley");
        cars.add("Jaguar");

        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }

        System.out.println("---------------");

        Collections.sort(cars);
        for (String i : cars) {
            System.out.println(i);
        }

        System.out.println("---------------");


        ArrayList<Integer> myNumbers = new ArrayList<>();
        myNumbers.add(17);
        myNumbers.add(15);
        myNumbers.add(29);
        myNumbers.add(25);
        for (int i : myNumbers) {
            System.out.println(i);
        }

        System.out.println("---------------");

        Collections.sort(myNumbers);  // Sort myNumbers

        for (int i : myNumbers) {
            System.out.println(i);
        }

    }
}

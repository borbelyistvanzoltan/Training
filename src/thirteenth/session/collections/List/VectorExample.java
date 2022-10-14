package thirteenth.session.collections.List;

import java.util.Vector;

public class VectorExample {

    public static void main(String[] args) {
        Vector<Integer> numbers = new Vector<>();
        numbers.add(4);
        numbers.add(12);
        numbers.add(1);

        System.out.println(numbers);

        // adding 7 to the 2nd place
        numbers.add(2, 7);
        System.out.println(numbers);

        //getting elements by index
        System.out.println("Element at index 2 is: " + numbers.get(2));

        //getting first element
        System.out.println("The first element of this vector is: " + numbers.firstElement());

        //getting last element
        System.out.println("The last element of this vector is: " + numbers.lastElement());

        //how to check vector is empty or not
        System.out.println("Is this vector empty: " + numbers.isEmpty());

        System.out.println("Size: " + numbers.size());
        System.out.println("Capacity: " + numbers.capacity());

        numbers.add(4);
        numbers.add(12);
        numbers.add(1);
        numbers.add(4);
        numbers.add(12);
        numbers.add(1);
        numbers.add(4);
        numbers.add(12);
        numbers.add(1);



        System.out.println("Capacity: " + numbers.capacity());

    }
}

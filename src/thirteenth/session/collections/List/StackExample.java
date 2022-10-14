package thirteenth.session.collections.List;

import java.util.Stack;

public class StackExample {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(4);
        stack.push(12);
        stack.push(1);

        System.out.println(stack);

        System.out.println("First element in stack: " + stack.get(0));

        stack.pop();

        System.out.println(stack);

        stack.push(10);

        System.out.println(stack);

        stack.add(2, 2);

        System.out.println(stack);

        //Peak
        System.out.println("Peak element: " + stack.peek());



        // Location
        System.out.println("Location of number 12: " + stack.search(12));

    }
}

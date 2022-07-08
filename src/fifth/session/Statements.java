package fifth.session;

public class Statements {
    public static void main(String args[]) {

        // if statement
        int x = 10;
        int y = 12;
        if (x + y > 20) {
            System.out.println("x + y is greater than 20");
        }


        // if-else statement
        if (x + y < 10) {
            System.out.println("x + y is less than 10");
        }   else {
            System.out.println("x + y is not less than 10");
        }

        // if-else-if statement
        if (x + y > 30) {
            System.out.println("x + y is greater than 30");
        }   else if (x + y < 10) {
            System.out.println("x + y is less than 10");
        }   else {
            System.out.println(x+y);
        }


        // switch statement - the switch permits only int, string and Enum type
        int num = 2;
        switch (num) {
            case 0:
                System.out.println("number is 0");
                break;
            case 1:
                System.out.println("number is 1");
                break;
            default:
                System.out.println(num);
        }


        // Loop statements
        // for loop
        int sum = 0;
        for (int j = 1; j <= 10; j++) {
            sum = sum + j;
        }
        System.out.println("The sum of first 10 natural numbers is " + sum);


        // for-each loop
        String[] names = {"Java","C","C++","Python","JavaScript"};
        System.out.println("Printing the content of the array names:\n");
        for (String barmi:names) {
            System.out.println(barmi);
        }


        // while loop
        int i = 0;
        System.out.println("Printing the list of first 10 even numbers \n");
        while (i<=10) {
            System.out.println(i);
            i = i + 2;
        }


        // do-while loop
        int j = 0;
        System.out.println("Printing the list of first 10 even numbers \n");
        do {
            System.out.println(j);
            j = j + 2;
        } while (j<=10);



        // break statement
        for(int k = 0; k <= 10; k++) {
            System.out.println(k);
            if(k == 6) {
                break;
            }
        }


        // continue statement
        for(int l = 0; l <= 5; l++) {
                if(l == 4) {
                    continue;
                }
                System.out.println(l);
            }

    }
}

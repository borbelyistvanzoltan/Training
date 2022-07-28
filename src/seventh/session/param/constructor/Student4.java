package seventh.session.param.constructor;

//Java Program to demonstrate the use of the parameterized constructor

public class Student4 {
    int id;
    String name;

    //creating a parameterized constructor

    /*
    Constructor name must be the same as its class name
    A Constructor must have no explicit return type
    A Java constructor cannot be abstract, static, final, and synchronized
     */

    Student4(int i,String n){
        id = i;
        name = n;
    }

    //method to display the values
    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String args[]) {
        //creating objects and passing values
        Student4 s1 = new Student4(111,"Laci");
        Student4 s2 = new Student4(222,"Adam");

        //calling method to display the values of object
        s1.display();
        s2.display();
    }
}

package seventh.session.statickeyword;

//Java Program to demonstrate the use of static variable
class Employee {

    int rollno; //instance variable
    String name;
    static String company ="Prozenda"; //static variable

    //constructor
    Employee(int r, String n){
        rollno = r;
        name = n;
    }

    //method to display the values
    void display (){System.out.println(rollno+" "+name+" "+ company);}
}
//Test class to show the values of objects
public class TestStaticVariable1{
    public static void main(String args[]){
        Employee s1 = new Employee(111,"Adam");
        Employee s2 = new Employee(222,"Eva");

        //we can change the company of all objects by the single line of code
        //Employee.company="Other company";
        s1.display();
        s2.display();
    }
}


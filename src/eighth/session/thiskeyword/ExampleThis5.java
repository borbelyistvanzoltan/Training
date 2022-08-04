package eighth.session.thiskeyword;

class Employee3 {

    int cardNumber;
    String name;
    float salary;
    String gender;

    Employee3(int cardNumber, String name, float salary){
        this.cardNumber = cardNumber;
        this.name = name;
        this.salary = salary;
    }

    Employee3(int cardNumber, String name, float salary, String gender){
        this(cardNumber, name, salary);
        this.gender = gender;
    }

    void display() {
        System.out.println(cardNumber + " " + name + " " + salary + " " + gender);
    }
}
class ExampleThis5{
    public static void main(String args[]){
        Employee3 e1 = new Employee3(54672123,"Bela", 100000.30f);
        Employee3 e2 = new Employee3(74334456,"Kati",120000.70f);
        Employee3 e3 = new Employee3(74334456,"Jozsef",120000.70f, "Male");
        e1.display();
        e2.display();
        e3.display();
    }
}

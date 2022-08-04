package eighth.session.thiskeyword;

class Employee {
    int cardNumber;
    String name;
    float salary;

    // Same name
    Employee(int cardNumber, String name, float salary){
        cardNumber = cardNumber;
        name = name;
        salary = salary;
    }

    void display() {
        System.out.println(cardNumber + " " + name + " " + salary);
    }
}
class Example1{
    public static void main(String args[]){
        Employee s1 = new Employee(54672123,"Bela", 100000.30f);
        Employee s2 = new Employee(74334456,"Kati",120000.70f);
        s1.display();
        s2.display();
    }
}

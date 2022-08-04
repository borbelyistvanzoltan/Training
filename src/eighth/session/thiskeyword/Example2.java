package eighth.session.thiskeyword;

class Employee2 {
    int cardNumber;
    String name;
    float salary;

    // The naming is the same but .this keyword will help us
    Employee2(int cardNumber, String name, float salary){
        this.cardNumber = cardNumber;
        this.name = name;
        this.salary = salary;
    }

    void display() {
        System.out.println(cardNumber + " " + name + " " + salary);
    }
}
class Example2{
    public static void main(String args[]){
        Employee2 s1 = new Employee2(434234123,"Bela", 100000.30f);
        Employee2 s2 = new Employee2(563214456,"Kati",120000.70f);
        s1.display();
        s2.display();
    }
}

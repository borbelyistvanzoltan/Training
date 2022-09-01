package nineth.session.superkeyword;

class Animal1 {
    void eat() {
        System.out.println("eating...");
    }
}

class Dog1 extends Animal1 {
    void eat() {
        System.out.println("eating bread...");
    }

    void bark() {
        System.out.println("barking...");
    }

    void work() {
        super.eat();
        bark();
    }
}

class SuperMethod {
    public static void main(String args[]){
        new Dog1().work();
    }
}

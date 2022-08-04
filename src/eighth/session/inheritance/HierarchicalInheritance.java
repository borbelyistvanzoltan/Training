package eighth.session.inheritance;

class AnimalB {
    void eat() {
        System.out.println("eating...");
    }
}

class DogB extends AnimalB {
    void bark() {
        System.out.println("Dog barking...");
    }
}

class Cat extends AnimalB {
    void meow(){System.out.println("Cat meowing...");}
}

class HierarchicalInheritance {
    public static void main(String args[]){
        Cat c=new Cat();
        c.meow();
        c.eat();

        DogB d = new DogB();
        d.bark();
        d.eat();
    }}

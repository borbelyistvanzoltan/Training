package eighth.session.inheritance;

class AnimalA {
    void eat() {
        System.out.println("eating...");
    }
}

class DogA extends AnimalA {
    void bark() {
        System.out.println("barking...");
    }
}

class BabyDog extends DogA {
    void weep() {
        System.out.println("weeping...");
    }
}

class MultiLevelInheritance {
    public static void main(String args[]){
        BabyDog d = new BabyDog();
        d.weep();
        d.bark();
        d.eat();
    }
}

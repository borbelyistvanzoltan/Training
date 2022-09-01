package tenth.session.finalkeyword;

class Vehicle {
    void speedUp() {          // not final/final method
        System.out.println("speed up vehicle");
    }   // not final/final variable
}

class Car2 extends Vehicle {
    void speedUp() {
        System.out.println("speed up car");
    }

    public static void main(String args[]){
        Car2 vw = new Car2();
        vw.speedUp();
    }
}

package tenth.session.finalkeyword;

class Vehicle1 {              // not final/final class
    void speedUp() {
        System.out.println("speed up vehicle");
    }
}

class Car3 extends Vehicle1 {
    void speedUp() {
        System.out.println("speed up car");
    }

    public static void main(String args[]){
        Car3 vw = new Car3();
        vw.speedUp();
    }
}

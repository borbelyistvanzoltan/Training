package tenth.session.finalkeyword;

class Car {
    int speed = 90;  // not final/final variable

    void speedUp() {
        speed = 130;
    }

    public static void main(String args[]) {
        Car vw = new  Car();
        vw.speedUp();
    }
}

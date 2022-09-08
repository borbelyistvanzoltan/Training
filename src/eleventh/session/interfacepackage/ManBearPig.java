package eleventh.session.interfacepackage;

interface Man {
    default void talk() {                   // default method / static method, coming from Java 8
        System.out.println("Bla bla bla");
    }
}

interface Bear {
    void brum();
}

interface Pig {
    void oink();
}

class ManBearPig implements Man, Bear, Pig {

    public void brum() {
        System.out.println("Brumm brumm");
    }

    public void oink() {
        System.out.println("Oink oink");
    }

    public static void main(String args[]) {
        ManBearPig manBearPig = new ManBearPig();
        manBearPig.talk();
        manBearPig.brum();
        manBearPig.oink();
    }
}

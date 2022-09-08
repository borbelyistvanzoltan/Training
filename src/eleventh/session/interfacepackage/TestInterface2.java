package eleventh.session.interfacepackage;

interface Bank{
    double rateOfEurToHuf();
}

class KHB implements Bank {
    public double rateOfEurToHuf() {
        return 0.994;
    }
}

class OTP implements Bank{
    public double rateOfEurToHuf() {
        return 0.995;
    }
}

class TestInterface2 {
    public static void main(String[] args) {
        Bank b = new KHB();
        System.out.println("EUR to HUF rate: " + b.rateOfEurToHuf());
    }
}

package eighth.session.thiskeyword;

class B {
    B() {
        System.out.println("hello b");
    }

    B(int x) {
        this();
        System.out.println(x);
    }
}

class ExampleThis3 {
    public static void main(String args[]) {
        B b = new B(10);
    }
}

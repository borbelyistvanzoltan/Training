package nineth.session.covarient.returntype;

class A {
    A get() {
        return this;
    }

    void message() {
        System.out.println("A: message method");
    }
}

class B extends A {
    @Override
    B get() {
        return this;
    }

    void message() {
        System.out.println("B: welcome to covariant return type");
    }

    public static void main(String args[]) {
        new A().get().message();
        new B().get().message();
    }
}

package tenth.session.runtimepolymorphism;

class Shape2 {
    String color = "blue";
}

class Rectangle2 extends Shape2 {
    String color = "yellow";
}

class Test {
    public static void main(String args[]) {
        Shape2 s = new Rectangle2();
        System.out.println(s.color);    // blue not yellow
    }
}

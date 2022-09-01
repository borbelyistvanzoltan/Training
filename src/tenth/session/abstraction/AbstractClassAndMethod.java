package tenth.session.abstraction;

abstract class Shape {
    abstract void draw();
    void draw2() {
        System.out.println("drawing rectangle");
    }
}

class Rectangle extends Shape{
    void draw() {
        System.out.println("drawing rectangle");
    }
}

class TestAbstraction1{
    public static void main(String args[]){
        Shape s = new Rectangle();
        s.draw();
    }
}

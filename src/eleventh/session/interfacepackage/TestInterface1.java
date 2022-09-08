package eleventh.session.interfacepackage;

//Interface declaration
interface Drawable {
    void draw();
}

//Interface implementation
class Rectangle implements Drawable{
    public void draw() {
        System.out.println("drawing rectangle");
    }
}

class Circle implements Drawable{
    public void draw() {
        System.out.println("drawing circle");
    }
}

//Using interface
class TestInterface1{
    public static void main(String args[]) {
        Drawable d = new Circle();
        d.draw();
    }
}

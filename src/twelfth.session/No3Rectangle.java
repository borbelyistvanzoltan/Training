class Rectangle {
    private double length, width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public void computeField(){
        System.out.println("A teglalap terulete: "+ getLength() * getWidth());
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }
}

class No3Rectangle {
    public static void main(String[] args) {

        Rectangle r = new Rectangle(2,2);
        r.computeField();
    }
}
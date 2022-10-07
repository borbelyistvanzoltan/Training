class Rectangle {

    private double length, width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void computeField() {
        System.out.println(getLength() * getWidth());
    }
}

class No3Rectangle {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(2,3);
        rectangle.computeField();
    }
}
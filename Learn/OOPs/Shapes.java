// Rectangle, Square, circle, cylinder, sphere

interface Dimension {
    void area();
    void volume();
}

class Square implements Dimension {
    public int length;
    
    Square(int l) {
        this.length = l;
    }

    @Override
    public void area() {
        System.out.println("Area of given square is: " + length * length);
    }
    @Override
    public void volume() {
        System.out.println("It's 2D, thus volume doesn't exist.");
    }
}
class Rectangle extends Square {
    private int breadth;
    
    Rectangle(int l, int b) {
        super(l);
        this.breadth = b;
    }

    @Override
    public void area() {
        System.out.println("Area of given rectangle is: " + length * breadth);
    }
    @Override
    public void volume() {
        System.out.println("It's 2D, thus volume doesn't exist.");
    }
}
class Circle implements Dimension {
    public int radius;

    Circle(int r) {
        this.radius = r;
    }

    @Override
    public void area() {
        System.out.printf("Area of given circle is %f square units", 3.14*radius*radius);
    }
    @Override
    public void volume() {
        System.out.println("2D, hence no volume.");
    }
}
class Cylinder extends Circle {
    public int height;

    Cylinder(int r, int h) {
        super(r);
        this.height = h;
    }

    @Override
    public void area() {
        System.out.printf("Area of given cylinder is %f square units", 2*3.14*radius*(radius + height));
    }
    @Override
    public void volume() {
        System.out.printf("Volume of given cylinder is %f cubic units", 3.14*radius*radius*height);
    }
}

public class Shapes {
    public static void main(String[] args) {
        
    }
}

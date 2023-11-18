// Rectangle, Square, circle, cylinder, sphere

interface Dimension {
    void area();
    void volume();
}

class Square1 implements Dimension {
    public int length;
    
    Square1(int l) {
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
class Rectangle1 extends Square1 {
    private int breadth;
    
    Rectangle1(int l, int b) {
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
class Circle1 implements Dimension {
    public int radius;

    Circle1(int r) {
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
class Cylinder1 extends Circle1 {
    public int height;

    Cylinder1(int r, int h) {
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
        Rectangle1 rec = new Rectangle1(13, 4);
        rec.area();
    }
}

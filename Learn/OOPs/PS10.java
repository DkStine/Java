class Rectangle {
    public int length, breadth;

    Rectangle(int l, int b) {
        this.length = l;
        this.breadth = b;
    }

    public int area() {
        return this.length * this.breadth;
    }
}
class Cuboid extends Rectangle {
    public int height;

    Cuboid(int l, int b, int h) {
        super(l, b);
        this.height = h;
    }

    public int volume() {
        return this.length * this.breadth * this.height;
    }

}

public class PS10 {
    public static void main(String[] args) {
        Cuboid cub = new Cuboid(4, 5, 6);

        System.out.println(cub.volume());
    }
}

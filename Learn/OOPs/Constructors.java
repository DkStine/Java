class MyCircle{
    private int radius;
    private float area;
    private float circumference;

    public MyCircle(int radius, float area, float circumference){
        this.radius = radius;
        this.area = area;
        this.circumference = circumference;
    }

    public void setR(int r){
        this.radius = r;
    }
    public void setAr(float ar){
        if (ar != 3.14f * radius * radius){
            System.out.println("invalid entry");
        }else{
            this.area = ar;
        }
    }
    public void setCircum(float cir){
        if (cir != 2 * 3.14f * radius){
            System.out.println("invalid entry");
        }else{
            this.circumference = cir;
        }
    }
    public int getR(){
        return radius;
    }
    public float getAr(){
        return area;
    }
    public float getCircum(){
        return circumference;
    }
    
}

public class Constructors {
    public static void main(String[] args) {
        MyCircle cir = new MyCircle(5, 75.2f, 12.23f);
        System.out.println(cir.getR() + cir.getCircum() + cir.getAr());
        System.out.printf("Radius is: %d, area is: %f, circumference is: %f", 
        cir.getR(), cir.getAr(), cir.getCircum());
    }
}

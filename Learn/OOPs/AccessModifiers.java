class Circle{
    private int radius;
    private float area;
    private float circumference;

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

public class AccessModifiers {
    public static void main(String[] args) {
        Circle cir = new Circle();
        cir.setR(3);
        cir.setAr(28.26f);
        cir.setCircum(18.84f);
        System.out.println(cir.getR());
        System.out.println(cir.getAr());
        System.out.println(cir.getCircum());
    }
}

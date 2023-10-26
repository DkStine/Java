class Cylinder{
    private float radius;
    private float height;

    public void setRadius(float r){
        this.radius = r;
    }
    public float getRadius(){
        return this.radius;
    }
    public void setHeight(float h){
        this.height = h;
    }
    public float getHeight(){
        return this.height;
    }
}

public class PracticeSet9 {
    public static void main(String[] args) {
        Cylinder cy = new Cylinder();

        cy.setRadius(5.4f);
        cy.setHeight(6.33f);
        System.out.println("The radius is: " + cy.getRadius()); 
        System.out.println("The height is: " + cy.getHeight());
    }
}

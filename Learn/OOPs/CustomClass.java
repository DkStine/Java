class Employee{
    // int id;
    int salary;
    String name;

    /* 
    public void showDetails(){
        System.out.printf("ID is %d\n", id);
        System.out.printf("Name is %s\n", name);
    }
    */
    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
}
class Cellphone{
    public void ringing(){
        System.out.println("Ringing");
    }
    public void vibrating(){
        System.out.println("Vibrating");
    }
    public void lagging(){
        System.out.println("Lagging");
    }
}
class Square{
    float side, perimeter, area; 

    public void initSide(float s){
        side = s;
    }
    public void area(){
        area = side*side;
    }
    public void perimeter(){
        perimeter = 4 * side; 
    }
}
class TommyVecetti{
    public void firing(){
        System.out.println("Firing=>=>");
    }
    public void hitting(){
        System.out.println("Hitting->");
    }
    public void running(){
        System.out.println("Running<<<,");
    }
}
public class CustomClass {
    public static void main(String[] args) {
        /* Question1
        Employee deepak = new Employee();
        deepak.setName("Deepak Kumar");
        deepak.salary = 12000;
        System.out.println(deepak.getName());
        System.out.println(deepak.getSalary());
        */
        /* Question2 
        Cellphone samsung = new Cellphone();
        samsung.vibrating();
        samsung.ringing();
        samsung.lagging();
        */
        /* Question3 
        Square sq = new Square();
        sq.initSide(6.7f);
        sq.area(); sq.perimeter();
        System.out.println(sq.area);
        System.out.println(sq.perimeter);
        */
        /* Question4 
        TommyVecetti character = new TommyVecetti();
        character.firing();
        character.running();
        character.hitting();
        */
    }
}

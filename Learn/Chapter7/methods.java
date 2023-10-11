package Learn.Chapter7;

public class methods {
    static void change(int [] array){
        array[1] = 134;
    }
    static int logic(int x, int y){
        int z;
        
        if(x > y){
            z = x + y;
        }else{
            z = (x + y) * 5;
        }

        return z;
    }
    public static void main(String[] args) {
        int a = 4, b = 5;

        int c = logic(a, b); // --> Static method calling
        System.out.println(c);
        /* 
        methods obj = new methods();

        int c = obj.logic(a, b);
        */

        // Changing array elements
        int [] arr = {1, 2, 3, 4};

        change(arr);
        System.out.println("The changed element is: " + arr[1]);
    }
}

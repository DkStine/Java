import java.util.Scanner;

class Student {
    int sId, sAge;
    double sGrade;
    String sName;

    public Student(int sId, int sAge, double sGrade, String sName) {
        this.sId = sId;
        this.sAge = sAge;
        this.sGrade = sGrade;
        this.sName = sName;
    }

    public int getsId() {
        return sId;
    }
    public int getsAge() {
        return sAge;
    }
    public double getsGrade() {
        return sGrade;
    }
    public String getsName() {
        return sName;
    }
}

public class Lab05 {
    static void validate(int num) {
        if (num < 0) {
            throw new ArithmeticException("Negative input");
        } else System.out.println("Correct input");
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Encapsulation -> Studentid, studentname, st_age, method - addGrades()
        Student s = new Student(1175, 19, 4.9, "TanTheta");
        System.out.println(s.getsId());
        System.out.println(s.getsName());
        System.out.println(s.getsAge());
        System.out.println(s.getsGrade());


        // Exception Handling --> WAP to create a method that takes an integer as a parameter and throws and exception if the number is odd.
        

        // WAP to create a method that takes string as I/P and throw and exception if the no. of 
        // vowels is more than 3

        // String matching

        in.close();
    }
}

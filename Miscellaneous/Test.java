class Student {
    private String name;
    Student(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    public void getName(int rollNum) {
        System.out.println(this.name + " roll no. " + rollNum);
    }
}

public class Test {
    public static void main(String[] args) {
        Student st = new Student("Deepak");
        System.out.println(st.getName());
    }
}

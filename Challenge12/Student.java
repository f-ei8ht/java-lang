package Challenge12;

public class Student {
    String name;
    int age;
    int rollNo;

    public Student(String name, int age, int rollNo) {
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
    }

    @Override
    public String toString() {
        return "Student: " + "{" +
                " Name: " + name + ", " +
                "Age: " + age + ", " +
                "Roll Number: " + rollNo +
                " }";
    }

    public static void main(String[] args) {
        Student student = new Student("Saif", 21, 23);
        System.out.println(student);
    }
}

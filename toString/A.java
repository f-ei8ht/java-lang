package toString;

public class A {
    String name;
    int rollno;
    int age;
    String school;
    private int count = 1;

    public A(String name, int rollno, int age, String school) {
        this.name = name;
        this.rollno = rollno;
        this.age = age;
        this.school = school;
    }

    @Override
    public String toString() {
        return "My name is " + name + " and I am " + age + " years old." + count;
    }

    public static void main(String[] args) {
        A saif = new A("saif", 31, 21, "Aloysian");
        System.out.println();
        System.out.println(saif);
    }
}

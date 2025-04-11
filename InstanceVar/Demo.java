package InstanceVar;

public class Demo {
    int x = 10;

    void display() {
        System.out.println(x);
    }
}

class Test {
    public static void main(String[] args) {
        Demo obj1 = new Demo();
        Demo obj2 = new Demo();

        ++obj1.x;

        System.out.println("X in object 1");
        obj1.display();
        System.out.println("X in obj 2");
        obj2.display();

    }
}

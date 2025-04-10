package Functionss;

public class Test {

    int myVar1;
    int myVar2;

    public static void main(String[] args) {
        Test obj = new Test();
        obj.myVar1 = 10;
        obj.myVar2 = 20;
        obj.swapbyRef(obj);
        Test obj2 = new Test();
        Test obj3 = new Test();
        obj2.myVar1 = 20;
        obj3.myVar1 = 30;
        System.out.println(obj.myVar1 + " " + obj.myVar2 + "" + obj2.myVar1 + " " + obj3.myVar1);

    }

    public void swapbyRef(Test obj1) {
        obj1.myVar1 = obj1.myVar1 + obj1.myVar2;
        obj1.myVar2 = obj1.myVar1 - obj1.myVar2;
        obj1.myVar1 = obj1.myVar1 - obj1.myVar2;
        System.out.println(obj1.myVar1 + " " + obj1.myVar2);
    }
}

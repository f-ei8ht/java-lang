package MemoryManagement;

public class MemoryManagement {
    public static void main(String[] args) {
        int primitiveVariable1 = 10;
        MemoryManagement mobj1 = new MemoryManagement();
        String stringLiteral = "24";
        MemoryManagement mobj2 = new MemoryManagement();
        System.out.println(System.identityHashCode(primitiveVariable1));
        System.out.println(mobj1);
        System.out.println(mobj2);
        System.out.println(System.identityHashCode(stringLiteral));
        System.out.println("-------------From the method main----------");
        mobj1.memoryManagementTest(mobj2); // calling of fn passing obj ref
    }

    private void memoryManagementTest(MemoryManagement obj) {
        MemoryManagement obj3 = obj;
        String stringLiteral2 = "24";
        String stringLiteral3 = new String("24");
        String stringLiteral4 = new String("24");
        stringLiteral4 = stringLiteral4.intern();
        System.out.println(obj);
        System.out.println(obj3);
        System.out.println(System.identityHashCode(stringLiteral2));
        System.out.println(System.identityHashCode(stringLiteral3));
        System.out.println(System.identityHashCode(stringLiteral4));
    }
}
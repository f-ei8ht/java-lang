package Challeng13.Employee;

public class Id {
    public static void main(String[] args) {
        Employee employee = new Employee("Saif Ali Khan", 12);
        System.out.println(employee.displayEmployee());
        employee.setId(11);
        employee.setName("nnnnn");
        System.out.println(employee.displayEmployee());
        int id = employee.getId();
        System.out.println(id);
    }
}

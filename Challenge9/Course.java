package Challenge9;

public class Course {

    static int maxCapcity = 100;
    String courseName;
    int enrolledStudents;

    String[] students = new String[maxCapcity];

    static void setMaxCapacity(int maxCapcity) {
        Course.maxCapcity = maxCapcity;
    }

    void enrolledStudents(String studentName) {
        students[enrolledStudents] = studentName;
        enrolledStudents++;
    }

    void notenrolledStudents(String studentName) {
        students[enrolledStudents] = studentName;
        enrolledStudents--;
    }
}

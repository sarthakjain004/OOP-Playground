import java.util.*;
class Student implements Cloneable {
    // Instance variables
    int id;
    String name;
    Course course; // Reference type

    // Constructor
    Student(int id, String name, String courseName) {
        this.id = id;
        this.name = name;
        this.course = new Course(courseName);
    }

    // Override clone method for shallow copying
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    // toString method for printing student details
    public String toString() {
        return "Student[id=" + id + ", name=" + name + ", course=" + course.courseName + "]";
    }
}

class Course {
    String courseName;

    Course(String courseName) {
        this.courseName = courseName;
    }
}

public class shallowCloning {
    public static void main(String[] args) {
        try {
            // Creating original object
            Student student1 = new Student(101, "John", "Java Programming");
            System.out.println("Original Object: " + student1);

            // Creating clone of student1
            Student student2 = (Student) student1.clone();
            System.out.println("Cloned Object: " + student2);

            // Demonstrating shallow copy
            // Changing primitive field in original object
            student1.id = 102;
            student1.name = "Jane";
            
            // Changing reference field in original object
            student1.course.courseName = "Python Programming";

            System.out.println("\nAfter changing values:");
            System.out.println("Original Object: " + student1);
            System.out.println("Cloned Object: " + student2);
            
            // Notice that courseName changed in both objects
            // This demonstrates shallow copying where reference variables
            // point to the same memory location

        } catch (CloneNotSupportedException e) {
            System.out.println("CloneNotSupportedException: " + e.getMessage());
        }
    }
}
// Student class representing individual students
import java.util.*;
class Student {
    private String name;
    private int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }
}

// Department class that has students (aggregation)
class Department {
    private String deptName;
    private Student[] students; // Department HAS-A Student

    public Department(String deptName, Student[] students) {
        this.deptName = deptName;
        this.students = students;
    }

    public void displayDepartmentInfo() {
        System.out.println("\nDepartment: " + deptName);
        System.out.println("Students in department:");
        for (Student student : students) {
            System.out.println("- " + student.getName());
        }
    }
}

// Main class to demonstrate aggregation
public class aggregation {
    public static void main(String[] args) {
        // Creating student objects
        Student s1 = new Student("John Doe", 101);
        Student s2 = new Student("Jane Smith", 102);
        Student s3 = new Student("Mike Johnson", 103);

        // Creating an array of students
        Student[] computerScienceStudents = {s1, s2};
        Student[] mathStudents = {s3};

        // Creating department objects with students
        Department computerScience = new Department("Computer Science", computerScienceStudents);
        Department mathematics = new Department("Mathematics", mathStudents);

        // Displaying department information
        computerScience.displayDepartmentInfo();
        mathematics.displayDepartmentInfo();

        // Note: Even if Department object is destroyed, Student objects will still exist
        // This demonstrates aggregation - where parts can exist without the whole
    }
}

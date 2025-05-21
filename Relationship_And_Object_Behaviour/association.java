// Association Example demonstrating one-to-one, one-to-many, and many-to-many relationships
import java.util.*;
// One-to-One: Student has one Address
class Address {
    private String street;
    private String city;
    
    public Address(String street, String city) {
        this.street = street;
        this.city = city;
    }
}

class Student {
    private String name;
    private Address address; // One-to-One Association
    
    public Student(String name, Address address) {
        this.name = name;
        this.address = address;
    }
}

// One-to-Many: University has many Departments
class Department {
    private String name;
    
    public Department(String name) {
        this.name = name;
    }
}

class University {
    private String name;
    private List<Department> departments; // One-to-Many Association
    
    public University(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }
    
    public void addDepartment(Department dept) {
        departments.add(dept);
    }
}

// Many-to-Many: Students can enroll in multiple Courses and Courses can have multiple Students
class Course {
    private String courseName;
    private List<Student> enrolledStudents; // Many-to-Many Association
    
    public Course(String courseName) {
        this.courseName = courseName;
        this.enrolledStudents = new ArrayList<>();
    }
    
    public void enrollStudent(Student student) {
        enrolledStudents.add(student);
    }
}

// Main class to demonstrate associations
public class association {
    public static void main(String[] args) {
        // One-to-One example
        Address addr = new Address("123 Main St", "Boston");
        Student student = new Student("John Doe", addr);
        
        // One-to-Many example
        University university = new University("MIT");
        university.addDepartment(new Department("Computer Science"));
        university.addDepartment(new Department("Physics"));
        
        // Many-to-Many example
        Course java = new Course("Java Programming");
        Course python = new Course("Python Programming");
        
        Student student1 = new Student("Alice", new Address("456 Oak St", "New York"));
        Student student2 = new Student("Bob", new Address("789 Pine St", "Chicago"));
        
        java.enrollStudent(student1);
        java.enrollStudent(student2);
        python.enrollStudent(student1);
    }
}
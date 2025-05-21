// Example of Association in Java
// Association represents a relationship between two separate classes where one class uses another class

// Class representing a Student
class Student {
    private String name;
    private int studentId;
    
    public Student(String name, int studentId) {
        this.name = name;
        this.studentId = studentId;
    }
    
    public String getName() {
        return name;
    }
}

// Class representing a Course
class Course {
    private String courseName;
    private Student[] students; // Association: Course has Students
    
    public Course(String courseName) {
        this.courseName = courseName;
        this.students = new Student[10]; // Can have up to 10 students
    }
    
    // Method to add a student to the course
    public void addStudent(Student student, int position) {
        if (position >= 0 && position < students.length) {
            students[position] = student;
        }
    }
    
    // Method to display enrolled students
    public void displayEnrolledStudents() {
        System.out.println("Students enrolled in " + courseName + ":");
        for (Student student : students) {
            if (student != null) {
                System.out.println(student.getName());
            }
        }
    }
}

// Main class to demonstrate association
public class association {
    public static void main(String[] args) {
        // Creating students
        Student student1 = new Student("John", 101);
        Student student2 = new Student("Alice", 102);
        
        // Creating a course
        Course javaCourse = new Course("Java Programming");
        
        // Adding students to the course (demonstrating association)
        javaCourse.addStudent(student1, 0);
        javaCourse.addStudent(student2, 1);
        
        // Displaying enrolled students
        javaCourse.displayEnrolledStudents();
    }
}
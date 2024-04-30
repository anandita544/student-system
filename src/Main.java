import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // Creating student and teacher objects
        Student student1 = new Student("John", 20, 1001);
        Student student2 = new Student("Alice", 21, 1002);
        Teacher teacher1 = new Teacher("Mr. Smith", 35, "Mathematics");
        Teacher teacher2 = new Teacher("Ms. Johnson", 40, "Science");


        StudentManagementSystem sms = new StudentManagementSystem();


        sms.enroll(student1);
        sms.enroll(student2);


        sms.assignTeacher(teacher1);
        sms.assignTeacher(teacher2);

        // Assigning students to teachers
        // Assuming you want to assign "John" to teacher1
        Student john = sms.findStudentByName("John");
        if (john != null) {
            sms.assignStudentToTeacher(john, teacher1);
        } else {
            System.out.println("Student John not found!");
        }

        // Displaying student and teacher records
        System.out.println("Student Records:");
        for (Student student : sms.getStudents()) {
            System.out.println("Name: " + student.getName() + ", Age: " + student.getAge() + ", Student ID: " + student.getStudentId());
        }

        System.out.println("\nTeacher Records:");
        for (Teacher teacher : sms.getTeachers()) {
            System.out.println("Name: " + teacher.getName() + ", Age: " + teacher.getAge() + ", Subject: " + teacher.getSubject());
//            System.out.println("Assigned Students:");
            Set<Student> assignedStudents = sms.getAssignedStudents(teacher);

            for (Student student : assignedStudents) {
                System.out.println("Assigned Students:");
                System.out.println("- " + student.getName());
            }
        }
    }
}

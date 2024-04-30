import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;

class StudentManagementSystem implements Enrollment, TeachingAssignment {
    private Set<Student> students;
    private Set<Teacher> teachers;
    private Map<Teacher, Set<Student>> assignments;

    public StudentManagementSystem() {
        students = new HashSet<>();
        teachers = new HashSet<>();
        assignments = new HashMap<>();
    }

    @Override
    public void enroll(Student student) {
        students.add(student);
    }

    @Override
    public void assignTeacher(Teacher teacher) {
        teachers.add(teacher);
        assignments.put(teacher, new HashSet<>());
    }




    public Set<Student> getStudents() {
        return students;
    }

    public Set<Teacher> getTeachers() {
        return teachers;
    }

    public Set<Student> getAssignedStudents(Teacher teacher) {
        return assignments.getOrDefault(teacher, new HashSet<>());
    }
    public Student findStudentByName(String name) {
        for (Student student : students) {
            if (student.getName().equals(name)) {
                return student;
            }
        }
        return null;
    }

@Override
public void assignCourseToTeacher(String course, Teacher teacher) {
    // Check if the teacher is already assigned to the system
    if (!teachers.contains(teacher)) {
        // If not assigned, add the teacher to the system
        assignTeacher(teacher);
    }

    // Get the set of students assigned to the teacher
    Set<Student> assignedStudents = assignments.get(teacher);

    // Assign the course to the teacher
    teacher.setCourse(course);

    // Output the information
    System.out.println("Assigned course " + course + " to teacher " + teacher.getName());

    // Print "Assigned Students" line
    System.out.println("Assigned Students:");

    // Print assigned students
    for (Student student : assignedStudents) {
        System.out.println("- " + student.getName());
    }
}

    public void assignStudentToTeacher(Student student, Teacher teacher) {
        // Ensure the teacher is already assigned to the system
        if (!teachers.contains(teacher)) {
            // If not assigned, add the teacher to the system
            assignTeacher(teacher);
        }

        // Get the set of students assigned to the teacher
        Set<Student> assignedStudents = assignments.get(teacher);

        // Assign the student to the teacher
        assignedStudents.add(student);
    }

}


import java.util.HashSet;
import java.util.Set;

class Student extends Person {
    private int studentId;
    private Set<String> courses;
    private String studentID;

    public Student(String name, int age, int studentId) {
        super(name, age);
        this.studentId = studentId;
        this.studentID = Integer.toString(studentId); // Convert int to String
        this.courses = new HashSet<>();
    }


    @Override
    public String getRole() {
        return "Student";
    }

    public int getStudentId() {
        return studentId;
    }

    public String getStudentID() {
        return studentID;
    }

    public void enrollCourse(String course) {
        courses.add(course);
    }

    public Set<String> getCourses() {
        return courses;
    }


}

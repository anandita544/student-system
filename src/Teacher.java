class Teacher extends Person {
    private String subject;
    private String course;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    @Override
    public String getRole() {
        return "Teacher";
    }

    public String getSubject() {
        return subject;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public void setCourse(String course) {
        this.course = course;
    }
}


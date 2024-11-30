import java.util.Objects;

public class Course {
    private String name;
    private String teacher;
    private String faculty;
    public static int a;
    public static int b;

    static {
        a = 1;
        b = 2;
    }

    {
        this.name = "Неизвестно";
        this.teacher = "Неизвестно";
        this.faculty = "Неизвестно";
    }

    public Course(String name, String teacher, String faculty) {
        this.name = name;
        this.teacher = teacher;
        this.faculty = faculty;
    }

    public Course(String name, String teacher) {
        this.name = name;
        this.teacher = teacher;
    }

    public Course(String name) {
        this.name = name;
    }

    public Course(){

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", teacher='" + teacher + '\'' +
                ", faculty='" + faculty + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return Objects.equals(name, course.name) && Objects.equals(teacher, course.teacher) && Objects.equals(faculty, course.faculty);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, teacher, faculty);
    }
}

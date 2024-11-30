import java.util.Objects;

public class Student {
    private String name;
    private Course course;
    private String surname;
    private int age;
    private int studentNumber;

    public static int a;
    public static int b;

    static {
        a = 1;
        b = 2;
    }

    {
        this.name = "";
        this.course = new Course();
        this.surname = "";
        this.age = 0;
        this.studentNumber = 0;
    }

    public Student(String name, Course course, String surname, int age, int studentNumber) {
        this.name = name;
        this.course = course;
        this.surname = surname;
        this.age = age;
        this.studentNumber = studentNumber;
    }

    public Student(String name, Course course, String surname, int age) {
        this.name = name;
        this.course = course;
        this.surname = surname;
        this.age = age;
    }

    public Student(String name, Course course, String surname) {
        this.name = name;
        this.course = course;
        this.surname = surname;
    }

    public Student(String name, Course course) {
        this.name = name;
        this.course = course;
    }

    public Student(String name) {
        this.name = name;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", studentNumber=" + studentNumber +
                '}';
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && studentNumber == student.studentNumber && Objects.equals(name, student.name) && Objects.equals(course, student.course) && Objects.equals(surname, student.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, course, surname, age, studentNumber);
    }
}

import java.util.List;
import java.util.Objects;

public class Group {
    private int number;
    private List<Student> students;
    private int peopleCount;
    private String direction;
    public static int a;
    public static int b;

    static {
        a = 1;
        b = 2;
    }

    {
        this.number = 0;
        this.students = List.of();
        this.peopleCount = 0;
        this.direction = "";
    }

    public Group(int number, List<Student> students, int peopleCount, String direction) {
        this.number = number;
        this.students = students;
        this.peopleCount = peopleCount;
        this.direction = direction;
    }

    public Group(int number, List<Student> students, int peopleCount) {
        this.number = number;
        this.students = students;
        this.peopleCount = peopleCount;
    }

    public Group(int number, List<Student> students) {
        this.number = number;
        this.students = students;
    }

    public Group(int number) {
        this.number = number;
    }

    public Group() {

    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public int getPeopleCount() {
        return peopleCount;
    }

    public void setPeopleCount(int peopleCount) {
        this.peopleCount = peopleCount;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    @Override
    public String toString() {
        return "Group{" +
                "number=" + number +
                ", students=" + students +
                ", peopleCount=" + peopleCount +
                ", direction='" + direction + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Group group = (Group) o;
        return number == group.number && peopleCount == group.peopleCount && Objects.equals(students, group.students) && Objects.equals(direction, group.direction);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, students, peopleCount, direction);
    }
}

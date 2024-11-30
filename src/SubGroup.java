import java.util.List;
import java.util.Objects;

public class SubGroup extends Group {
    private int subGroup;

    public static int a;
    public static int b;

    static {
        a = 1;
        b = 2;
    }

    {
        this.subGroup = -1;
    }

    public SubGroup(int number, List<Student> students, int peopleCount, String direction, int subGroup) {
        super(number, students, peopleCount, direction);
        this.subGroup = subGroup;
    }

    public SubGroup(int number, List<Student> students, int peopleCount, String direction) {
        super(number, students, peopleCount, direction);
    }

    public SubGroup(int number, List<Student> students, int peopleCount){
        super(number, students, peopleCount);
    }

    public SubGroup(int number, List<Student> students){
        super(number, students);
    }

    public SubGroup(int number){
        super(number);
    }

    public SubGroup(){
        super();
    }



    public int getSubGroup() {
        return subGroup;
    }

    public void setSubGroup(int subGroup) {
        this.subGroup = subGroup;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        SubGroup subGroup1 = (SubGroup) o;
        return subGroup == subGroup1.subGroup;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), subGroup);
    }
}

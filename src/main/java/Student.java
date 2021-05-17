import java.util.ArrayList;
import java.util.List;

public class Student {

    private String name;
    private long id;
    private List<Integer> grades = new ArrayList<>();

    public Student(String name, long id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public long getId() {
        return this.id;
    }
}

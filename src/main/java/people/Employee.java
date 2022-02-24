package people;

public class Employee extends Person{
    private static Integer idCount = 0;
    private Integer id;
    private Enum<Job> Job;

    public Employee(String firstName, String lastName, Integer id, Job job) {
        super(firstName, lastName);
        id = ++idCount;
    }

    public Integer getId() {
        return id;
    }

    public Integer getJob() {
        return getJob();
    }

    @Override
    public String toString() {
        return this.getFullName() +
                " " + id + getJob();
    }
}

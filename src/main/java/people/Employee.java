package people;

public class Employee <D> extends Person{
    private static Integer idCount = 0;
    private Integer id;
    private Job job;
    private D item;

    public Employee(String firstName, String lastName, Integer id, Job job, D item) {
        super(firstName, lastName);
        id = ++idCount;
        this.job = job;
        this.item = item;
    }


    public Integer getId() {
        return id;
    }

    public Job getJob() {
        return job;
    }

    @Override
    public String toString() {
        return this.getFullName() +
                " " + id + job;
    }
}

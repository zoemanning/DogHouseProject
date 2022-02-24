package people;

public class Employee <P> extends Person{
    private static Integer idCount = 0;
    private Integer id;
    private Job job;
    private P pet;

    public Employee(String firstName, String lastName, Integer id, Job job, P pet) {
        super(firstName, lastName);
        id = ++idCount;
        this.job = job;
        this.pet = pet;
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

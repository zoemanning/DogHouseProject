package people.employees;

import people.Cashier;
import people.Employee;
import people.Job;

public class CathyCashier<D> extends Employee implements Cashier<D> {
    private D item;

    public CathyCashier(String firstName, String lastName, Integer id, Job job, Object item) {
        super(firstName, lastName, id, job, item);
    }


    @Override
    public void sellDog() {

    }

    @Override
    public void sellFood() {

    }

    @Override
    public void greetCustomer() {

    }
}

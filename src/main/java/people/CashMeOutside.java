package people;

public class CashMeOutside <D> extends Employee implements Cashier <D>{
    private D item;

    public CashMeOutside(String firstName, String lastName, Integer id, Job job, Object item) {
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

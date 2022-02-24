package people;

public class Customer <D> extends Person{

    private D item;

    public Customer(String firstName, String lastName, D item) {
        super(firstName, lastName);

    }

    public void purchase(){

    }
}


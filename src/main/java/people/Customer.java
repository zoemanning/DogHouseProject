package people;

public class Customer <P> extends Person{

    private P pet;

    public Customer(String firstName, String lastName, P pet) {
        super(firstName, lastName);

    }

    public void purchase(){

    }
}


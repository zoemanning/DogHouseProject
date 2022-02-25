package people;

public class Customer <P> extends Person{

    private P pet;
    private Double price;


    public Customer(String firstName, String lastName, Double price, P pet) {
        super(firstName, lastName);

        this.price = price;
        this.pet = pet;
    }

    public void purchase(){

    }
}


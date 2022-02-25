package people;

public class Customer<P> extends Person {

    private P pet;

    public Customer(String firstName, String lastName, P pet) {
        super(firstName, lastName);

        this.pet = pet;
    }


    public String purchase() {

        return "Hello, I'm ready to purchase this " + pet;

    }


}


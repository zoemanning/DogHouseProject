package people.employees;

import people.Feeder;
import people.Person;

public class FrankFeeder <D> extends Person implements Feeder <D> {
    public FrankFeeder(String firstName, String lastName) {
        super(firstName, lastName);
    }

    @Override
    public void feedDog() {

    }
}

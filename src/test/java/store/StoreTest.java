package store;

import dogs.breeds.Boxer;
import org.testng.annotations.Test;
import people.Customer;
import petshop.Store;

public class StoreTest {

    @Test
    public void addDogTest(){
        Customer<Boxer> customer = new Customer<>("Dolly", "Jordan", new Boxer());
        Store<Customer<Boxer>, Boxer> store = new Store<>();
        store.addDogs(customer);
    }
}

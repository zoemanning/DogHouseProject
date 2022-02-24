package store;

import dogs.breeds.Boxer;
import org.testng.annotations.Test;
import people.Customer;
import people.Employee;
import petshop.Store;

public class StoreTest {

    @Test
    public void addDogTest(){
        Employee<Boxer>  = new Employee<>("Dolly", "Jordan", new Boxer());
        Store<Employee<Boxer>, Boxer> store = new Store<>();
        store.addDogs(Boxer);
    }
}

package store;

import dogs.breeds.Boxer;
import org.testng.annotations.Test;
import people.Customer;

public class StoreTest {

    @Test
    public void hireTest01(){
        Customer<Boxer> employee = new Employee<>("Joe", "Jackson", 38, new Shoe());
        Store<Employee<Shoe>, Shoe> store = new Store<>();
        store.hireEmployee(employee);
    }
}

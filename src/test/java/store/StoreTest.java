package store;

import dogs.*;
import dogs.breeds.BichonFrise;
import dogs.breeds.Boxer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import people.Employee;
import people.Job;
import people.employees.CathyCashier;
import people.employees.FrankFeeder;
import petshop.Store;

public class StoreTest {

    @Test
    public void hireEmployeeTest(){
        Employee<CathyCashier> employee = new Employee<>("Joe", "Brown", 1, Job.CASHIER );
        Store<Employee<CathyCashier>, Boxer> store = new Store<>();
        store.hireEmployee(employee);
        int expected = 1;
        int actual = employee.getId();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void hireEmployeeTest02(){
        Employee<FrankFeeder> employee = new Employee<>("Joe", "Brown", 2, Job.FEEDER );
        Store<Employee<FrankFeeder>, Boxer> store = new Store<>();
        store.hireEmployee(employee);
        int expected = 1;
        int actual = employee.getId();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void sellTest01() throws Exception {
        Store<Employee<BichonFrise>, BichonFrise> store = new Store<>();
        store.addDogs(new BichonFrise("Bella", 2000.00, EnergyLevel.LOW, BarkLevel.SMALL_BARK, HairType.HAIRLESS, Size.SMALL));
        Double expected = 2000.00;
        Double actual = store.sellDog().getPrice();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void sellTest02() throws Exception {
        Store<Employee<CathyCashier>, BichonFrise> store = new Store<>();
        store.addDogs(new BichonFrise("Bella", 2500.00, EnergyLevel.LOW, BarkLevel.SMALL_BARK, HairType.HAIRLESS, Size.SMALL));
        String expected = "Bella";
        String actual = store.sellDog().getName();
        Assertions.assertEquals(expected, actual);


}
}

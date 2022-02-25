package store;

import dogs.BarkLevel;
import dogs.EnergyLevel;
import dogs.HairType;
import dogs.Size;
import dogs.breeds.BichonFrise;
import dogs.breeds.Boxer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import people.Employee;
import people.Job;
import people.employees.CathyCashier;
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
    public void sellTest01() throws Exception {
        Store<Employee<BichonFrise>, BichonFrise> store = new Store<>();
        store.addDogs(new BichonFrise("Bella", 2000.00, EnergyLevel.LOW, BarkLevel.SMALL_BARK, HairType.HAIRLESS, Size.SMALL));
        String expected = "BichonFrise";
        String actual = store.sellDog().getDogName();
        Assertions.assertEquals(expected, actual);
    }

    public void addDogsTest(){
        Employee<BichonFrise> employee = new Employee<>("Joe", "Jackson", 1, Job.CASHIER, new BichonFrise("Bella", 2000.00, EnergyLevel.LOW, BarkLevel.SMALL_BARK, HairType.HAIRLESS, Size.SMALL)); ;
        Store<Employee<BichonFrise>, BichonFrise> store = new Store<>();
        //store.addDogs(BichonFrise);
    }
}

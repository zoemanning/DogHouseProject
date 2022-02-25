package store;

import dogs.BarkLevel;
import dogs.EnergyLevel;
import dogs.HairType;
import dogs.Size;
import dogs.breeds.BichonFrise;
import dogs.breeds.Boxer;
import org.junit.jupiter.api.Test;
import people.Employee;
import people.Job;
import petshop.Store;

public class StoreTest {

    @Test
    public void hireEmployeeTest(){
        Employee<BichonFrise> employee = new Employee<>("Joe", "Jackson", 1, Job.CASHIER, new BichonFrise("Bella", 2000.00, EnergyLevel.LOW, BarkLevel.SMALL_BARK, HairType.HAIRLESS, Size.SMALL)); ;
        Store<Employee<BichonFrise>, BichonFrise> store = new Store<>();
        store.hireEmployee(employee);
    }

    @Test
    public void hireEmployeeTest01(){
        Employee<BichonFrise> employee = new Employee<>("Joe", "Jackson", 1, Job.CASHIER, new BichonFrise("Bella", 2000.00, EnergyLevel.LOW, BarkLevel.SMALL_BARK, HairType.HAIRLESS, Size.SMALL)); ;
        Store<Employee<BichonFrise>, BichonFrise> store = new Store<>();
        store.hireEmployee(employee);
    }

}

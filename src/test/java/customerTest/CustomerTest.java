package customerTest;

import dogs.*;
import dogs.breeds.Boxer;
import dogs.breeds.Labrador;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import people.Customer;

public class CustomerTest {

    @Test
    public void customerTest(){
        Customer<Boxer> customer = new Customer("David", "Johnson", new Boxer<>("Bailey", 2345.0, EnergyLevel.MEDIUM, BarkLevel.MEDIUM_BARK, HairType.MEDIUM, Size.MEDIUM));
        String expected = "David Johnson";
        String actual =customer.getFullName();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void customerPurchaseTest01(){
        Customer<Boxer> customer = new Customer("David", "Johnson", new Boxer<>("Bailey", 2345.0, EnergyLevel.MEDIUM, BarkLevel.MEDIUM_BARK, HairType.MEDIUM, Size.MEDIUM));
        String expected = "Hello, I'm ready to purchase this FamilyDog{name='Bailey', price=2345.0}";
        String actual =customer.purchase();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void customerPurchaseTest02(){
        Customer<Boxer> customer = new Customer("David", "Johnson", new Labrador<>("Tucker", 1999.0, EnergyLevel.MEDIUM, BarkLevel.MEDIUM_BARK, HairType.MEDIUM, Size.MEDIUM));
        String expected = "Hello, I'm ready to purchase this TrainedDog{name='Tucker', price=1999.0}";
        String actual =customer.purchase();
        Assertions.assertEquals(expected, actual);
        }
    }



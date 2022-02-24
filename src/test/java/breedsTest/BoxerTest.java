package breedsTest;

import dogs.*;
import dogs.breeds.Boxer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BoxerTest {
    @Test
    public void guardPropertyTest(){
        FamilyDog<Boxer> boxer = new FamilyDog<>("Boxy",50.0, EnergyLevel.HIGH, BarkLevel.MEDIUM_BARK, HairType.SHORT, Size.LARGE);

        String expected = "Dog{" +
                "energyLevel=" + "High Energy" +
                ", barkLevel=" + "Medium Bark Level" +
                ", hairType=" + "Short Haired" +
                ", size=" + "Large" +
                '}';
        String actual = boxer.toString();
        Assertions.assertEquals(expected,actual);


    }
}

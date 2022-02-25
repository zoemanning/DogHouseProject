package breedsTest;

import dogs.*;
import dogs.breeds.Yorkie;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RottweilerTest {
    @Test
    public void dogConstructorTest01() {
        FamilyDog<RottweilerTest> rottweiler = new FamilyDog<>("Rot", 50.0, EnergyLevel.HIGH, BarkLevel.LOUD_BARK, HairType.SHORT, Size.MEDIUM);

        String expected = "FamilyDog{" +
                "name='" + "Rot" + '\'' +
                ", price=" + "50.0" +
                '}';
        String actual = rottweiler.toString();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void meetDogTest(){
        FamilyDog<RottweilerTest> rottweiler = new FamilyDog<>("Rot", 50.0, EnergyLevel.HIGH, BarkLevel.LOUD_BARK, HairType.SHORT, Size.MEDIUM);

        String expected = "Hi, I'm Rot";
        String actual = rottweiler.meetDog();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getPriceTest(){
        FamilyDog<RottweilerTest> rottweiler = new FamilyDog<>("Rot", 50.0, EnergyLevel.HIGH, BarkLevel.LOUD_BARK, HairType.SHORT, Size.MEDIUM);

        Double expected = 50.0;
        Double actual = rottweiler.getPrice();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void getEnergyLevelTest(){
        FamilyDog<RottweilerTest> rottweiler = new FamilyDog<>("Rot", 50.0, EnergyLevel.HIGH, BarkLevel.LOUD_BARK, HairType.SHORT, Size.MEDIUM);

        EnergyLevel expected = EnergyLevel.HIGH;
        EnergyLevel actual = rottweiler.getEnergyLevel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getBarkLevelTest(){
        FamilyDog<RottweilerTest> rottweiler = new FamilyDog<>("Rot", 50.0, EnergyLevel.HIGH, BarkLevel.LOUD_BARK, HairType.SHORT, Size.MEDIUM);

        BarkLevel expected = BarkLevel.LOUD_BARK;
        BarkLevel actual = rottweiler.getBarkLevel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getHairTypeTest(){
        FamilyDog<RottweilerTest> rottweiler = new FamilyDog<>("Rot", 50.0, EnergyLevel.HIGH, BarkLevel.LOUD_BARK, HairType.SHORT, Size.MEDIUM);

        HairType expected = HairType.SHORT;
        HairType actual = rottweiler.getHairType();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getSizeTest(){
        FamilyDog<RottweilerTest> rottweiler = new FamilyDog<>("Rot", 50.0, EnergyLevel.HIGH, BarkLevel.LOUD_BARK, HairType.SHORT, Size.MEDIUM);

        Size expected = Size.MEDIUM;
        Size actual = rottweiler.getSize();

        Assertions.assertEquals(expected, actual);
    }

}

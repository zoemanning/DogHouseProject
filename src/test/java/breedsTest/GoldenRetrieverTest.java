package breedsTest;

import dogs.*;
import dogs.breeds.GoldenRetriever;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GoldenRetrieverTest {

    @Test
    public void dogConstructorTest01() {
        FamilyDog<GoldenRetriever> golden = new FamilyDog<>("Sally", 100.0, EnergyLevel.MEDIUM, BarkLevel.MEDIUM_BARK, HairType.MEDIUM, Size.LARGE);

        String expected = "FamilyDog{" +
                "name='" + "Sally" + '\'' +
                ", price=" + "100.0" +
                '}';
        String actual = golden.toString();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void meetDogTest01() {
        FamilyDog<GoldenRetriever> golden = new FamilyDog<>("Sally", 100.0, EnergyLevel.MEDIUM, BarkLevel.MEDIUM_BARK, HairType.MEDIUM, Size.LARGE);

        String expected = "Hi, I'm Sally";
        String actual = golden.meetDog();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void getPriceTest(){
        FamilyDog<GoldenRetriever> golden = new FamilyDog<>("Sally", 100.0, EnergyLevel.MEDIUM, BarkLevel.MEDIUM_BARK, HairType.MEDIUM, Size.LARGE);

        Double expected = 100.0;
        Double actual = golden.getPrice();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void getEnergyLevelTest(){
        FamilyDog<GoldenRetriever> golden = new FamilyDog<>("Sally", 100.0, EnergyLevel.MEDIUM, BarkLevel.MEDIUM_BARK, HairType.MEDIUM, Size.LARGE);

        EnergyLevel expected = EnergyLevel.MEDIUM;
        EnergyLevel actual = golden.getEnergyLevel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getBarkLevelTest(){
        FamilyDog<GoldenRetriever> golden = new FamilyDog<>("Sally", 100.0, EnergyLevel.MEDIUM, BarkLevel.MEDIUM_BARK, HairType.MEDIUM, Size.LARGE);

        BarkLevel expected = BarkLevel.MEDIUM_BARK;
        BarkLevel actual = golden.getBarkLevel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getHairTypeTest(){
        FamilyDog<GoldenRetriever> golden = new FamilyDog<>("Sally", 100.0, EnergyLevel.MEDIUM, BarkLevel.MEDIUM_BARK, HairType.MEDIUM, Size.LARGE);

        HairType expected = HairType.MEDIUM;
        HairType actual = golden.getHairType();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getSizeTest(){
        FamilyDog<GoldenRetriever> golden = new FamilyDog<>("Sally", 100.0, EnergyLevel.MEDIUM, BarkLevel.MEDIUM_BARK, HairType.MEDIUM, Size.LARGE);

        Size expected = Size.LARGE;
        Size actual = golden.getSize();

        Assertions.assertEquals(expected, actual);
    }

}
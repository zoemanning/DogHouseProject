package breedsTest;
import dogs.*;
import dogs.breeds.Boxer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BoxerTest {
    @Test
    public void dogConstructorTest01() {
        FamilyDog<Boxer> boxer = new FamilyDog<>("Boxy", 50.0, EnergyLevel.HIGH, BarkLevel.MEDIUM_BARK, HairType.SHORT, Size.LARGE);

        String expected = "FamilyDog{" +
                "name='" + "Boxy" + '\'' +
                ", price=" + "50.0" +
                '}';
        String actual = boxer.toString();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void meetDogTest(){
        FamilyDog<Boxer> boxer = new FamilyDog<>("Boxy", 50.0, EnergyLevel.HIGH, BarkLevel.MEDIUM_BARK, HairType.SHORT, Size.LARGE);

        String expected = "Hi, I'm Boxy";
        String actual = boxer.meetDog();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getPriceTest(){
        FamilyDog<Boxer> boxer = new FamilyDog<>("Boxy", 50.0, EnergyLevel.HIGH, BarkLevel.MEDIUM_BARK, HairType.SHORT, Size.LARGE);

        Double expected = 50.0;
        Double actual = boxer.getPrice();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void getEnergyLevelTest(){
        FamilyDog<Boxer> boxer = new FamilyDog<>("Boxy", 50.0, EnergyLevel.HIGH, BarkLevel.MEDIUM_BARK, HairType.SHORT, Size.LARGE);

        EnergyLevel expected = EnergyLevel.HIGH;
        EnergyLevel actual = boxer.getEnergyLevel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getBarkLevelTest(){
        FamilyDog<Boxer> boxer = new FamilyDog<>("Boxy", 50.0, EnergyLevel.HIGH, BarkLevel.MEDIUM_BARK, HairType.SHORT, Size.LARGE);

        BarkLevel expected = BarkLevel.MEDIUM_BARK;
        BarkLevel actual = boxer.getBarkLevel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getHairTypeTest(){
        FamilyDog<Boxer> boxer = new FamilyDog<>("Boxy", 50.0, EnergyLevel.HIGH, BarkLevel.MEDIUM_BARK, HairType.SHORT, Size.LARGE);

        HairType expected = HairType.SHORT;
        HairType actual = boxer.getHairType();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getSizeTest(){
        FamilyDog<Boxer> boxer = new FamilyDog<>("Boxy", 50.0, EnergyLevel.HIGH, BarkLevel.MEDIUM_BARK, HairType.SHORT, Size.LARGE);

        Size expected = Size.LARGE;
        Size actual = boxer.getSize();

        Assertions.assertEquals(expected, actual);
    }



}

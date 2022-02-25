package breedsTest;
import dogs.*;
import dogs.breeds.Yorkie;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class YorkieTest {
    @Test
    public void dogConstructorTest01() {
        FamilyDog<Yorkie> yorkie = new FamilyDog<>("NY", 50.0, EnergyLevel.HIGH, BarkLevel.SMALL_BARK, HairType.MEDIUM, Size.TEACUP);

        String expected = "FamilyDog{" +
                "name='" + "NY" + '\'' +
                ", price=" + "50.0" +
                '}';
        String actual = yorkie.toString();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void meetDogTest(){
        FamilyDog<Yorkie> yorkie = new FamilyDog<>("NY", 50.0, EnergyLevel.HIGH, BarkLevel.SMALL_BARK, HairType.MEDIUM, Size.TEACUP);

        String expected = "Hi, I'm NY";
        String actual = yorkie.meetDog();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getPriceTest(){
        FamilyDog<Yorkie> yorkie = new FamilyDog<>("NY", 50.0, EnergyLevel.HIGH, BarkLevel.SMALL_BARK, HairType.MEDIUM, Size.TEACUP);

        Double expected = 50.0;
        Double actual = yorkie.getPrice();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void getEnergyLevelTest(){
        FamilyDog<Yorkie> yorkie = new FamilyDog<>("NY", 50.0, EnergyLevel.HIGH, BarkLevel.SMALL_BARK, HairType.MEDIUM, Size.TEACUP);

        EnergyLevel expected = EnergyLevel.HIGH;
        EnergyLevel actual = yorkie.getEnergyLevel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getBarkLevelTest(){
        FamilyDog<Yorkie> yorkie = new FamilyDog<>("NY", 50.0, EnergyLevel.HIGH, BarkLevel.SMALL_BARK, HairType.MEDIUM, Size.TEACUP);

        BarkLevel expected = BarkLevel.SMALL_BARK;
        BarkLevel actual = yorkie.getBarkLevel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getHairTypeTest(){
        FamilyDog<Yorkie> yorkie = new FamilyDog<>("NY", 50.0, EnergyLevel.HIGH, BarkLevel.SMALL_BARK, HairType.MEDIUM, Size.TEACUP);

        HairType expected = HairType.MEDIUM;
        HairType actual = yorkie.getHairType();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getSizeTest(){
        FamilyDog<Yorkie> yorkie = new FamilyDog<>("NY", 50.0, EnergyLevel.HIGH, BarkLevel.SMALL_BARK, HairType.MEDIUM, Size.TEACUP);

        Size expected = Size.TEACUP;
        Size actual = yorkie.getSize();

        Assertions.assertEquals(expected, actual);
    }

}

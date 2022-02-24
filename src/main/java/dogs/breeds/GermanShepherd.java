package dogs.breeds;

import dogs.*;

public class GermanShepherd <P> extends TrainedDog<P> implements GuardDog<P>, GuideDog<P>, TherapyComfortDog<P> {

    public GermanShepherd(String name, P dogType, Double price, EnergyLevel energyLevel, BarkLevel barkLevel, HairType hairType, Size size) {
        super(name, dogType, price, energyLevel, barkLevel, hairType, size);
    }

    public String meetDog(){
        return "Hi, I'm adorable";
    }

    @Override
    public void guardProperty(P dog) {
        System.out.println("I will protect you");
    }

    @Override
    public void guideOwner(P dog) {
        System.out.println("Follow me");
    }

    @Override
    public void comfortOwner(P dog) {
        System.out.println("I'm here for you");
    }
}

package dogs.breeds;

import dogs.*;

public class GermanShepherd <P> extends TrainedDog<P> implements GuardDog<P>, GuideDog<P>, TherapyComfortDog<P> {


    public GermanShepherd(String name, Double price, EnergyLevel energyLevel, BarkLevel barkLevel, HairType hairType, Size size) {
        super(name, price, energyLevel, barkLevel, hairType, size);
    }

    public String meetDog(){
        return "Hi, I'm adorable";
    }

    @Override
    public String guardProperty(P dog) {
        return"I will protect you";
    }

    @Override
    public String guideOwner(P dog) {
        return "Follow me";
    }

    @Override
    public String comfortOwner(P dog) {
        return "I'm here for you";
    }
}

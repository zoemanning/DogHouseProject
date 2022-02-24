package dogs.breeds;

import dogs.*;

public class GoldenRetriever <P> extends TrainedDog<P> implements TherapyComfortDog<P>, GuideDog<P> {


    public GoldenRetriever(String name, Double price, EnergyLevel energyLevel, BarkLevel barkLevel, HairType hairType, Size size) {
        super(name, price, energyLevel, barkLevel, hairType, size);
    }

    public String meetDog(){
        return "Hi, I'm adorable";
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

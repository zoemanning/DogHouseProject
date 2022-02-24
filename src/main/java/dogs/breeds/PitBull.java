package dogs.breeds;

import dogs.*;

public class PitBull <P> extends TrainedDog<P> implements GuardDog<P> {

    public PitBull(String name, P dogType, Double price, EnergyLevel energyLevel, BarkLevel barkLevel, HairType hairType, Size size) {
        super(name, dogType, price, energyLevel, barkLevel, hairType, size);
    }

    public String meetDog(){
        return "Hi, I'm adorable";
    }

    @Override
    public String guardProperty(P dog) {
        return "I will protect you";
    }
}

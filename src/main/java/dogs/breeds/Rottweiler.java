package dogs.breeds;

import dogs.*;

public class Rottweiler <P> extends TrainedDog<P> implements GuardDog<P> {


    public Rottweiler(String name, Double price, EnergyLevel energyLevel, BarkLevel barkLevel, HairType hairType, Size size) {
        super(name, price, energyLevel, barkLevel, hairType, size);
    }

    public String meetDog(){
        return "Hi, I'm adorable";
    }

    @Override
    public String guardProperty(P dog) {
        return "I will protect you";
    }
}

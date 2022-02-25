package dogs.breeds;

import dogs.*;

public class Mastiff <P> extends FamilyDog<P> implements GuardDog<P> {


    public Mastiff(String name, Double price, EnergyLevel energyLevel, BarkLevel barkLevel, HairType hairType, Size size) {
        super(name, price, energyLevel, barkLevel, hairType, size);
    }

    @Override
    public String guardProperty(P dog) {
        return"I will protect you";
    }
}

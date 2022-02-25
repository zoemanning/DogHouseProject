package dogs.breeds;

import dogs.*;

public class Labradoodle <P> extends FamilyDog<P> implements HypoAllergenic<P> {


    public Labradoodle(String name, Double price, EnergyLevel energyLevel, BarkLevel barkLevel, HairType hairType, Size size) {
        super(name, price, energyLevel, barkLevel, hairType, size);
    }

    @Override
    public String doNotShed(P dog) {
        return "I got your allergies";
    }
}

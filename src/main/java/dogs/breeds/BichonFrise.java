package dogs.breeds;

import dogs.*;

public class BichonFrise <P> extends FamilyDog<P> implements HypoAllergenic <P> {

    public BichonFrise(String name, P dogType, Double price, EnergyLevel energyLevel, BarkLevel barkLevel, HairType hairType, Size size) {
        super(name, dogType, price, energyLevel, barkLevel, hairType, size);
    }

    public String meetDog(){
        return "Hi, I'm adorable";
    }
    @Override
    public String doNotShed(P dog) {
        return"I got your allergies";
    }
}

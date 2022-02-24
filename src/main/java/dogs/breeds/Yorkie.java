package dogs.breeds;

import dogs.*;

public class Yorkie <P> extends FamilyDog<P> implements HoseBroken<P> {

    public Yorkie(String name, Double price, EnergyLevel energyLevel, BarkLevel barkLevel, HairType hairType, Size size) {
        super(name, price, energyLevel, barkLevel, hairType, size);
    }

    public String meetDog(){
        return "Hi, I'm adorable";
    }

    @Override
    public String notifyOwner(P dog) {
        return "I have to go";
    }
}

package dogs.breeds;

import dogs.*;

public class Mastiff <P> extends FamilyDog<P> implements GuardDog<P> {

    public Mastiff(String name, P dogType, Double price, EnergyLevel energyLevel, BarkLevel barkLevel, HairType hairType, Size size) {
        super(name, dogType, price, energyLevel, barkLevel, hairType, size);
    }

    public String meetDog(){
        return "Hi, I'm adorable";
    }

    @Override
    public void guardProperty(P dog) {
        System.out.println("I will protect you");
    }
}

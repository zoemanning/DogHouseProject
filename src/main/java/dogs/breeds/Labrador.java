package dogs.breeds;

import dogs.*;

public class Labrador <P> extends TrainedDog<P> implements GuideDog<P>, TherapyComfortDog<P> {

    public Labrador(String name, P dogType, Double price, EnergyLevel energyLevel, BarkLevel barkLevel, HairType hairType, Size size) {
        super(name, dogType, price, energyLevel, barkLevel, hairType, size);
    }

    public String meetDog(){
        return "Hi, I'm adorable";
    }

    @Override
    public String guideOwner(P dog) {
        return "Follow me";
    }

    @Override
    public String comfortOwner(P dog) {return "I'm here for you";
    }
}


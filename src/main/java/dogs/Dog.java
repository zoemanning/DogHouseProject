package dogs;

public abstract class Dog {
    private EnergyLevel energyLevel;
    private BarkLevel barkLevel;
    private HairType hairType;
    private Size size;

    public Dog(EnergyLevel energyLevel, BarkLevel barkLevel, HairType hairType, Size size) {
        this.energyLevel = energyLevel;
        this.barkLevel = barkLevel;
        this.hairType = hairType;
        this.size = size;
    }

    public EnergyLevel getEnergyLevel() {
        return energyLevel;
    }

    public BarkLevel getBarkLevel() {
        return barkLevel;
    }

    public HairType getHairType() {
        return hairType;
    }

    public Size getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "energyLevel=" + energyLevel +
                ", barkLevel=" + barkLevel +
                ", hairType=" + hairType +
                ", size=" + size +
                '}';
    }
}


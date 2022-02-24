package dogs;

public abstract class FamilyDog <P> extends Dog{

    private String name;
    private P dogType;
    private Double price;

    public FamilyDog(String name, P dogType, Double price, EnergyLevel energyLevel, BarkLevel barkLevel, HairType hairType, Size size) {
        super(energyLevel, barkLevel, hairType, size);
        this.name = name;
        this.dogType = dogType;
        this.price = price;
    }


    public String meetDog(){
        return "Hi, My name is " + name + "I am a "+ dogType + "dog.";
    }
}

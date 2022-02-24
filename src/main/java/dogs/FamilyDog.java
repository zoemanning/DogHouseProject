package dogs;

public class FamilyDog <P> extends Dog{

    private String name;
    private Double price;

    public FamilyDog(String name, Double price, EnergyLevel energyLevel, BarkLevel barkLevel, HairType hairType, Size size) {
        super(energyLevel, barkLevel, hairType, size);
        this.name = name;
        this.price = price;
    }


    public String meetDog(){
        return "Hi, My name is " + name;
    }
}

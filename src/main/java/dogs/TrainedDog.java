package dogs;

public class TrainedDog <P> extends Dog {

    private String name;
    private Double price;

    public TrainedDog(String name, Double price, EnergyLevel energyLevel, BarkLevel barkLevel, HairType hairType, Size size) {
        super(energyLevel, barkLevel, hairType, size);
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }


    public String meetDog() {
        return "Hi, I'm " + name;
    }
}

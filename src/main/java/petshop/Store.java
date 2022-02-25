package petshop;

import java.util.ArrayList;

public class Store<E, P> {

    private ArrayList<E> employees;
    private ArrayList<P> dogs;

    public Store() {
        employees = new ArrayList<>();
        dogs = new ArrayList<>();
    }


    public void hireEmployee(E employee) {
        employees.add(employee);
    }

    public P sellDog() throws Exception {
        if (dogs.isEmpty())
            throw new Exception("No more dogs");
        return dogs.remove(0);
    }

    public void addDogs(P pet) {

        dogs.add(pet);
    }


}



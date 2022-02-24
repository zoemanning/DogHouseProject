package petshop;

import java.util.ArrayList;

public class Store<E, D> {

    private ArrayList<E> employees;
    private ArrayList<D> dogs;

    public Store() {
        employees = new ArrayList<>();
        dogs = new ArrayList<>();
    }


    public void hireEmployee(E employee) {
        employees.add(employee);
    }

    public D sell() throws Exception {
        if (dogs.isEmpty())
            throw new Exception("No more inventory");
        return dogs.remove(0);
    }

    public void addDogs(D item) {

        dogs.add(item);
    }


}



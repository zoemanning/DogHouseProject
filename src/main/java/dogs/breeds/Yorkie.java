package dogs.breeds;

import dogs.*;

public class Yorkie <D> implements HoseBroken<D> {

    public String meetDog(){
        return "Hi, I'm adorable";
    }

    @Override
    public void notifyOwner(D dog) {
        System.out.println("I have to go");
    }
}

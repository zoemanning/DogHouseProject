package dogs.breeds;

import dogs.*;

public class Yorkie <D> implements HoseBroken<D> {

    public String meetDog(){
        return "Hi, I'm adorable";
    }

    @Override
    public String notifyOwner(D dog) {
        return "I have to go";
    }
}

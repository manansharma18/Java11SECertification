public class AnimalType implements Herbivore,Omnivore {
    public void eatPlants(int quantity){}
    public void eatMeat(){}
    public void eatPlants(){}
}


interface Herbivore{
    void eatPlants();
}

interface Omnivore{
    void eatPlants(int quantity);
    void eatMeat();
}

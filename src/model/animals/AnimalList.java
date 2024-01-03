package model.animals;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AnimalList implements Iterable<Animal> {

    private List<Animal> animalList;

    public AnimalList() {
        animalList=new ArrayList<>();
    }

    public void addAnimal(Animal animal){
        animalList.add(animal);
    }

    @Override
    public Iterator iterator() {
        return new AnimalIterator(animalList);
    }
}

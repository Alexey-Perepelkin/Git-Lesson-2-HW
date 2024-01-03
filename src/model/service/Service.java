package model.service;


import model.animals.*;

import java.time.LocalDate;
import java.util.List;

public class Service {
    private int animalID;
    private AnimalList animalList;
    private Animal animal;
    public Service() {
        animalList=new AnimalList();
    }
    public Animal findFromId(int id){
        for (Animal animal :animalList)
            if (animal.getId()==id){
                return animal;
            }
        return  null;
    }
    public void addSkill(int id,String description){
        Animal animal=findFromId(id);
        animal.addSkill(description);
    }
    public void addAnimals(String name, LocalDate birthday, TypeAnimal typeAnimal)
    {
        switch (typeAnimal){
            case Dog :
                //System.out.println("sfsafdsafafs");
                animal=new Dog(animalID++,name,birthday);
                System.out.println( animal.getName());
                break;
            case Cat:
                animal=new Cat(animalID++,name,birthday);
                break;
            case Camel:
                animal=new Camel(animalID++,name,birthday);
                break;
            case Donkey:
                animal=new Donkey(animalID++,name,birthday);
                break;
            case Horse:
                animal=new Horse(animalID++,name,birthday);
                break;
            case Hamster:
                animal=new Hamster(animalID++,name,birthday);
                break;
        }

        animalList.addAnimal(animal);
    }
    public String getInfo(){
        StringBuilder stb= new StringBuilder();
        stb.append("Список животных: ");
        stb.append("\n");
        for (Animal animal:animalList ){
            stb.append(animal);
            stb.append("\n");
        }
        return stb.toString();
    }
}

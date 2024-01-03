package model.animals;

import java.time.LocalDate;

public class Dog extends Animal implements HomeAnimal{
    public Dog(int id, String name, LocalDate birthday) {
        super(id, name, birthday);
    }
    @Override
    public String typeAnimal() {
        return "Собака";
    }
}

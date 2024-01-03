package model.animals;

import java.time.LocalDate;

public class Hamster extends Animal implements HomeAnimal{
    public Hamster(int id, String name, LocalDate birthday) {
        super(id, name, birthday);
    }
    @Override
    public String typeAnimal() {
        return "Хомяк";
    }
}

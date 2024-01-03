package model.animals;

import java.time.LocalDate;

public class Donkey extends Animal implements BeastBurden{
    public Donkey(int id, String name, LocalDate birthday) {
        super(id, name, birthday);
    }
    @Override
    public String typeAnimal() {
        return "Осел";
    }
}

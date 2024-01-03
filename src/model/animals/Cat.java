package model.animals;

import java.time.LocalDate;

public class Cat extends Animal implements HomeAnimal {
    public Cat(int id, String name, LocalDate birthday) {
        super(id, name, birthday);
    }
    @Override
    public String typeAnimal() {
        return "Кошка";
    }
}

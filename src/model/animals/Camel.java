package model.animals;

import java.time.LocalDate;

public class Camel extends Animal implements BeastBurden{
    public Camel(int id, String name, LocalDate birthday) {
        super(id, name, birthday);
    }

    @Override
    public String typeAnimal() {
        return "Верблюд";
    }

}

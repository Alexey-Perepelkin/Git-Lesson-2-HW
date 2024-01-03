package model.animals;

import java.time.LocalDate;

public class Horse extends Animal implements BeastBurden{
    public Horse(int id, String name, LocalDate birthday) {
        super(id, name, birthday);
    }
    @Override
    public String typeAnimal() {
        return "Лошадь";
    }
}

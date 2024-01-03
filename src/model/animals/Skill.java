package model.animals;

public class Skill {
    private int id;
    private  String descriptionSkill;

    public Skill(int id, String descriptionSkill) {
        this.id = id;
        this.descriptionSkill = descriptionSkill;
    }

    @Override
    public String toString() {
        return descriptionSkill ;
    }
}

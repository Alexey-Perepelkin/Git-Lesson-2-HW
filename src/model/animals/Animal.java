package model.animals;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public abstract class Animal {
    protected int id;
    private  int idSkill;
    protected String name;
    protected LocalDate birthday;
    protected List <Skill>skills;

    public Animal(int id, String name, LocalDate birthday) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        skills = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getBirthday() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        return formatter.format(birthday);
    }
    public abstract String typeAnimal();
    String getSkills() {
        StringBuilder stb = new StringBuilder();
        stb.append("Навыки: ");
        for (Skill str: skills){
            stb.append(str);
            stb.append(",");
        }
        return stb.toString();
    }
    public void addSkill(String skilldescription){
        Skill skill=new Skill(idSkill++,skilldescription);
        skills.add(skill);
    }
    @Override
    public String toString() {
        return getId() +
                " " +
                typeAnimal() +
                " " +
                getName() +
                " " +
                getBirthday() +
                " " +
                getSkills();
    }
}

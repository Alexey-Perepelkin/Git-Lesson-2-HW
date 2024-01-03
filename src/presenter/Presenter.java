package presenter;

import model.animals.TypeAnimal;
import model.service.Service;
import view.View;

import java.time.LocalDate;

public class Presenter {
    private View view;
    private Service service;

    public Presenter(View view) {
        this.view = view;
        service=new Service();
    }

    public void addAnimal(String name, LocalDate localDate, String type) {
        service.addAnimals(name,localDate, TypeAnimal.valueOf(type));
    }

    public void changeAnimal(int idAnimal) {

    }

    public void ListAnimals() {
        String answer= service.getInfo();
        view.printAnswer(answer);
    }

    public void addSkill(int id,String str) {
        service.addSkill(id ,str);
    }

    public void deleteAnimal(int id) {
        service.delAnimal(id);

    }
}

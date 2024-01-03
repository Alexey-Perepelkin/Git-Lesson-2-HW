package view;

import model.animals.TypeAnimal;
import presenter.Presenter;

import java.time.LocalDate;
import java.util.Scanner;

public class ConsoleUI implements View{
    private static final String INPUT_ERROR = "Вы ввели неверное значение";
    private Presenter presenter;
    private Scanner scanner;
    private boolean work;
    private MainMenu mainMenu;
    private MenuCreateAnimal menuCreateAnimal;

    public ConsoleUI() {
        presenter=new Presenter(this);
        scanner=new Scanner(System.in);
        work=true;
        mainMenu=new MainMenu(this);
        menuCreateAnimal=new MenuCreateAnimal(this);

    }

    @Override
    public void stare() {
        System.out.println("Животные");
        while(work){
            System.out.println(mainMenu.menu());
            String choice=scanner.nextLine();
            if (checkTextForInt(choice)){
                int choiceInt = Integer.parseInt(choice);
                if (checkCommand(choiceInt)){
                    mainMenu.execute(choiceInt);
                }
            }
        }

    }

    public void getAnimalListInfo() {
        presenter.ListAnimals();
    }

    public void finish() {
        scanner.close();
        work=false;
    }

    public void deleteAnimal() {
    }

    public void addSkill() {
        System.out.println("Введите ID животного");
        String idAnimal=scanner.nextLine();
        int idAnimalInt=Integer.parseInt(idAnimal);
        System.out.println("Введите команду дрессировки");
        String str =scanner.nextLine();
        presenter.addSkill(idAnimalInt,str);
    }

    public void listSkills() {
    }

    public void changeAnimal() {
        System.out.println("Выберете Id животного");
        int idAnimal=scanner.nextInt();
        presenter.changeAnimal(idAnimal);
        
    }

    public  void addAnimal(){
        System.out.println("Укажите тип животного ");
        System.out.println(menuCreateAnimal.menu());
        String choice=scanner.nextLine();
        if (checkTextForInt(choice)){
            int choiceInt = Integer.parseInt(choice);
            if (checkCommand(choiceInt)){
                menuCreateAnimal.execute(choiceInt);
            }
        }
    }
    private void inputDate(String str){
        System.out.println("Укажите имя животного");
        String name =scanner.nextLine();
        System.out.println("Укажите год ");
        String year= scanner.nextLine();
        int yearInt = Integer.parseInt(year);

        System.out.println("Укажите месяц ");
        String moynth= scanner.nextLine();
        int moynthInt = Integer.parseInt(moynth);

        System.out.println("Укажите день ");
        String date = scanner.nextLine();
        int dateInt = Integer.parseInt(date);

        presenter.addAnimal(name, LocalDate.of(yearInt,moynthInt,dateInt), str);

    }
    public void createDog(){
        String str="Dog";
       inputDate(str);
        //System.out.println(str);

    }
    public void createCat(){
        String str="Cat";
        inputDate(str);
    }
    public void createCamel(){
        String str="Camel";
        inputDate(str);
    }
    public void createDonkey(){
        String str="Donkey";
        inputDate(str);
    }
    public void createHamster(){
        String str="Hamster";
        inputDate(str);
    }
    public void createHorse(){
        String str="Horse";
        inputDate(str);
    }
    private boolean checkTextForInt(String text){
        if (text.matches("[0-9]+")){
            return true;
        } else {
            inputError();
            return false;
        }
    }

    private boolean checkCommand(int numCommand){
        if (numCommand < mainMenu.getSize()){
            return true;
        } else {
            inputError();
            return false;
        }
    }
    @Override
    public void printAnswer(String answer) {
        System.out.println(answer);
    }
    private void inputError(){
        System.out.println(INPUT_ERROR);
    }
}

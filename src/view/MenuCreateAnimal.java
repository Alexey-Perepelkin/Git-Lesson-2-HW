package view;

import view.Commands.Command;
import view.Commands.CreateTypeAnimal.*;
import view.Commands.MainCommand.*;

import java.util.ArrayList;
import java.util.List;

public class MenuCreateAnimal {private List<Command> commandList;

    public MenuCreateAnimal(ConsoleUI consoleUI) {
        commandList=new ArrayList<>();
        commandList.add(new CreateCamel(consoleUI));
        commandList.add(new CreateCat(consoleUI));
        commandList.add(new CreateDog(consoleUI));
        commandList.add(new CreateDonkey(consoleUI));
        commandList.add(new CreateHamster(consoleUI));
        commandList.add(new CreateHorse(consoleUI));


    }
    public String menu (){
        StringBuilder stb=new StringBuilder();
        for(int i=0;i<commandList.size();i++){
            stb.append(i+1);
            stb.append(". ");
            stb.append(commandList.get(i).getDescription());
            stb.append("\n");
        }

        return stb.toString();
    }
    public void execute(int numCommand){
        Command command=commandList.get(numCommand-1);
        command.execute();
    }
}
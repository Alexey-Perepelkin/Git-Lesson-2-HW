package view;

import view.Commands.Command;
import view.Commands.MainCommand.*;

import java.util.ArrayList;
import java.util.List;

public class MainMenu {
    private List<Command> commandList;

    public MainMenu(ConsoleUI consoleUI) {
        commandList=new ArrayList<>();
        commandList.add(new AddAnimal(consoleUI));
        commandList.add(new AddSkill(consoleUI));
        //commandList.add(new ChangeAnimal(consoleUI));
        commandList.add(new DeleteAnimal(consoleUI));
        commandList.add(new getAnimalListInfo(consoleUI));
        //commandList.add(new ListSkills (consoleUI));
        commandList.add(new Finish (consoleUI));

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
    public int getSize(){
        return commandList.size();
    }
    public void execute(int numCommand){
        Command command=commandList.get(numCommand-1);
        command.execute();
    }
}

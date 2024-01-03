package view.Commands.MainCommand;

import view.Commands.Command;
import view.ConsoleUI;

public class AddAnimal extends Command {
    public AddAnimal( ConsoleUI consoleUI) {
        super("Добавить животного", consoleUI);
    }


    @Override
    public void execute() {
        super.getConsoleUI().addAnimal();
    }
}

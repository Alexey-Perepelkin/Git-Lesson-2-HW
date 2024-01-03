package view.Commands.MainCommand;

import view.Commands.Command;
import view.ConsoleUI;

public class ChangeAnimal extends Command {
    public ChangeAnimal( ConsoleUI consoleUI) {
        super("Изменить данные о животном", consoleUI);
    }
    @Override
    public void execute() {
        super.getConsoleUI().changeAnimal();
    }
}

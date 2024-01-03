package view.Commands.MainCommand;

import view.Commands.Command;
import view.ConsoleUI;

public class DeleteAnimal extends Command {
    public DeleteAnimal( ConsoleUI consoleUI) {
        super("Удалить животного из списка", consoleUI);
    }
    @Override
    public void execute() {
        super.getConsoleUI().deleteAnimal();
    }
}

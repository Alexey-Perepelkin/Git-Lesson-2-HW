package view.Commands.CreateTypeAnimal;

import view.Commands.Command;
import view.ConsoleUI;

public class CreateCat extends Command {
    public CreateCat(ConsoleUI consoleUI) {
        super("Кошка", consoleUI);
    }


    @Override
    public void execute() {
        super.getConsoleUI().createCat();
    }
}

package view.Commands.CreateTypeAnimal;

import view.Commands.Command;
import view.ConsoleUI;

public class CreateCamel extends Command {
    public CreateCamel(ConsoleUI consoleUI) {
        super("Верблюд", consoleUI);
    }


    @Override
    public void execute() {
        super.getConsoleUI().createCamel();
    }
}

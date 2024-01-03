package view.Commands.CreateTypeAnimal;

import view.Commands.Command;
import view.ConsoleUI;

public class CreateDog extends Command {
    public CreateDog(ConsoleUI consoleUI) {
        super("Собака", consoleUI);
    }


    @Override
    public void execute() {
        super.getConsoleUI().createDog();
    }
}

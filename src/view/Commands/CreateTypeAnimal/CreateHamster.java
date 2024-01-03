package view.Commands.CreateTypeAnimal;

import view.Commands.Command;
import view.ConsoleUI;

public class CreateHamster extends Command {
    public CreateHamster(ConsoleUI consoleUI) {
        super("Хомяк", consoleUI);
    }


    @Override
    public void execute() {
        super.getConsoleUI().createHamster();
    }
}

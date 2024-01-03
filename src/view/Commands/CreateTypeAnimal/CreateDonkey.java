package view.Commands.CreateTypeAnimal;

import view.Commands.Command;
import view.ConsoleUI;

public class CreateDonkey extends Command {
    public CreateDonkey(ConsoleUI consoleUI) {
        super("Осел", consoleUI);
    }


    @Override
    public void execute() {
        super.getConsoleUI().createDonkey();
    }
}

package view.Commands.CreateTypeAnimal;

import view.Commands.Command;
import view.ConsoleUI;

public class CreateHorse extends Command {
    public CreateHorse(ConsoleUI consoleUI) {
        super("Лошадь", consoleUI);
    }


    @Override
    public void execute() {
        super.getConsoleUI().createHorse();
    }
}

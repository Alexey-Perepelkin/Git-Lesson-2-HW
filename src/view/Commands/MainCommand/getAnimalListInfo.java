package view.Commands.MainCommand;

import view.Commands.Command;
import view.ConsoleUI;

public class getAnimalListInfo extends Command {
    public getAnimalListInfo(ConsoleUI consoleUI) {
        super("Список всех животных", consoleUI);
    }
    @Override
    public void execute() {
        super.getConsoleUI().getAnimalListInfo();
    }
}

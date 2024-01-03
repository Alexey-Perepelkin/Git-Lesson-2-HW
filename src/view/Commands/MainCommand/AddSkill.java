package view.Commands.MainCommand;

import view.Commands.Command;
import view.ConsoleUI;

public class AddSkill extends Command {
    public AddSkill( ConsoleUI consoleUI) {
        super("Дрессировать животного", consoleUI);
    }
    @Override
    public void execute() {
        super.getConsoleUI().addSkill();
    }
}

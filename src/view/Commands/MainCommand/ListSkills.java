package view.Commands.MainCommand;

import view.Commands.Command;
import view.ConsoleUI;

public class ListSkills extends Command {
    public ListSkills( ConsoleUI consoleUI) {
        super("Умения животного", consoleUI);
    }
    @Override
    public void execute() {
        super.getConsoleUI().listSkills();
    }
}

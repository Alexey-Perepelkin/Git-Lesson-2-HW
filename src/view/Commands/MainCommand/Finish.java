package view.Commands.MainCommand;

import view.Commands.Command;
import view.ConsoleUI;

public class Finish extends Command {
    public Finish( ConsoleUI consoleUI) {
        super("Выход", consoleUI);
    }
    @Override
    public void execute() {
        super.getConsoleUI().finish();
    }
}

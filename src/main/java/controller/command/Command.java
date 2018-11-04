package controller.command;

import utils.Commands;
import view.View;

public abstract class Command implements Executable{
    protected View view;
    private CommandType commandType;
    private int sizeOfSplitCommand;

    Command(View view) {
        this.view = view;
    }

    public void prepareCommand(CommandType commandType) {
        this.commandType = commandType;
        sizeOfSplitCommand = Commands.sizeOfSplitArray(commandType.getCommandPattern());
    }

    @Override
    public final void execute(String userInput) {
        if (!isCommandPatternValid(userInput)) {
            writeInvalidArgumentsMessage();
        }
        executeConnected(userInput);
    }

    private boolean isCommandPatternValid(String userInput) {
        return sizeOfSplitCommand == Commands.sizeOfSplitArray(userInput);
    }


    private void writeInvalidArgumentsMessage() {
        view.write("Проверьте правильность ввода команды, команда должна быть вида: " +
                commandType.getCommandPattern());
    }

    protected abstract void executeConnected(String userInput);
}

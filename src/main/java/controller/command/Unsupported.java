package controller.command;

import view.View;

public class Unsupported extends Command {
    public Unsupported(View view) {
        super(view);
    }

    @Override
    protected void executeConnected(String userInput) {
        view.write("Такой команды не существует: " + userInput);
    }
}

package controller.command;

import view.View;

public class Exit extends Command{

    public Exit(View view) {
        super(view);
    }

    @Override
    protected void executeConnected(String userInput) {
        view.write("Работа программы окончена!");
    }
}

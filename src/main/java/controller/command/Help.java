package controller.command;

import view.View;

public class Help extends Command {

    public Help(View view) {
        super(view);
    }

    @Override
    protected void executeConnected(String userInput) {
        view.write("Список команд: ");
        for (CommandType commandType : CommandType.values()) {
            view.write("\t" + commandType.getCommandPattern() + " - "
                    + commandType.getDescription());
        }
    }
}

package controller.command;

import view.View;

import static utils.Utils.*;

public class GroupList extends Command {
    GroupList(View view) {
        super(view);
    }

    @Override
    protected void executeConnected(String userInput) {
        view.write("Список групп:");
        printGroupList(getGroupList());
    }
}

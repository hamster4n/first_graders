package controller.command;

import view.View;

import static utils.Utils.*;

public class ProfList extends Command {

    ProfList(View view) {
        super(view);
    }

    @Override
    protected void executeConnected(String userInput) {
        view.write("Список профессоров:");
        printProfessorList(getProfessorList());
    }
}

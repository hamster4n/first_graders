import controller.MainController;
import model.Group;
import model.InstituteParticipant;
import model.Professor;
import view.Console;
import view.View;

import java.util.ArrayList;

import static utils.Utils.*;

public class Main {
    public static void main(String[] args) {
        View view = new Console();
        MainController mainController = new MainController(view);
        mainController.run();
    }
}

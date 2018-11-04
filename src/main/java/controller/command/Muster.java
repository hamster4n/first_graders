package controller.command;

import model.Group;
import utils.Commands;
import utils.Utils;
import view.View;

import java.lang.reflect.Method;

public class Muster extends Command {

    Muster(View view) {
        super(view);
    }

    @Override
    protected void executeConnected(String userInput) {
//        view.write("тут отрабатывает команда muster");
        String[] args = Commands.splitArrayOf(userInput);
        view.write("Профессор " + args[1] + " провёл перекличку в группе " + args[2]);
        String methodName = "get" + args[2] + "Group";
        try {
            Method setNameMethod = Utils.class.getMethod(methodName);
            Group group = (Group) setNameMethod.invoke(methodName);
            Utils.muster(group);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

package controller.command;

import model.Group;
import utils.Commands;
import utils.Utils;
import view.View;

import java.lang.reflect.Method;

public class Headman extends Command {
    Headman(View view) {
        super(view);
    }

    @Override
    protected void executeConnected(String userInput) {
        String[] args = Commands.splitArrayOf(userInput);
        String methodName = "get" + args[1] + "Group";
        try {
            Method setNameMethod = Utils.class.getMethod(methodName);
            Group group = (Group) setNameMethod.invoke(methodName);
            Utils.getHeadman(group);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

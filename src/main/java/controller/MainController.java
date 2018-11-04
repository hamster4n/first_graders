package controller;

import view.View;

public class MainController {
    private View view;

    public MainController(View view) {
        this.view = view;
    }

    public void run(){
        CommandHandler commandHandler = new CommandHandler(view);
        view.write("***************Старт работы**********************");
        view.write("База по школе создана. Теперь можно выполнять запросы.");
        view.write("Введи команду (или help для помощи):");
        while (true) {
            String input = view.read();
            commandHandler.handleCommand(input);
            if (input.toLowerCase().equals("exit")) {
                view.write("Спасибо за проделанную работу! Хорошего дня!");
                break;
            }
            view.write("Введи команду (или help для помощи):");
        }
    }
}

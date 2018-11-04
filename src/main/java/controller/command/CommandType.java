package controller.command;

public enum CommandType {

    EXIT(
            "exit",
            "exit",
            Exit::new,
            "Выйти из программы"
    ),
    HELP(
            "help",
            "help",
            Help::new,
            "Помощь"
    ),
    PROFLIST(
            "profList",
            "profList",
            ProfList::new,
            "Список проффесорского состава"
    ),
    MUSTER(
            "muster",
            "muster|фамилия профессора|название группы",
            Muster::new,
            "перекличка. Пример команды: muster|Urgant|1JAVA1"
    ),

    HEADMAN(
            "headman",
            "headmen|название группы",
            Headman::new,
            "Выбор старосты в группе. Пример команды: headmen|1PHP1"
    ),

    GROUPLIST(
            "grouplist",
            "groupList",
            GroupList::new,
            "Список групп"
    ),

    UNSUPPORTED(
            "unsupported",
            "unsupported",
            Unsupported::new,
            "Любая команда, которой нет в списке команд"
    );


    private String name;
    private String commandPattern;
    private CommandSupplier<? extends Command> commandSupplier;
    private String description;

    <C extends Command> CommandType(String name, String commandPattern, CommandSupplier<C> commandSupplier, String description) {
        this.name = name;
        this.commandPattern = commandPattern;
        this.commandSupplier = commandSupplier;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getCommandPattern() {
        return commandPattern;
    }

    public String getDescription() {
        return description;
    }

    public CommandSupplier<? extends Command> getCommandSupplier() {
        return commandSupplier;
    }
}

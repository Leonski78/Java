package FamilyTree.Interface.commands;

import FamilyTree.Interface.Console;

public class AddHuman extends Command {
    public AddHuman(Console console) {
        super(console);
    }

    @Override
    public String description() {
        return "Добавление человека в семью. ";
    }

    @Override
    public void execute() {
        getConsole().addHumanNew();
    }
}
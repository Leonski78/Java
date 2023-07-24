package FamilyTree;

import java.io.IOException;

import FamilyTree.model.familyTree.FamilyTree;
import FamilyTree.model.familyTree.Human;
import FamilyTree.model.familyTree.IO;
import FamilyTree.model.Comporator.ComporatorAge;
import FamilyTree.presenter.Presenter;
import FamilyTree.Interface.Console;
import FamilyTree.Interface.View;

public class main {
     public static void main(String[] args) throws IOException, ClassNotFoundException {
        FamilyTree<Human> tree = new FamilyTree<>();

        tree.addFamilyTree(new Human("Александр", "муж", 51));
        tree.addFamilyTree(new Human("Татьяна", "жен", 50));
        tree.addFamilyTree(new Human("Вероника", "м",
                tree.getByName("Александр"), tree.getByName("Татьяна")));
        tree.addFamilyTree(new Human("Леонид", "м",
                tree.getByName("Александр"), tree.getByName("Татьяна")));

        View view = new Console();
        IO serialize = new IO();
        ComporatorAge sortAge =  new ComporatorAge();
        new Presenter(view, familyTree, serialize, sortAge);

        view.start();
    }
}

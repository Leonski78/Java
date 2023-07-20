package FamilyTree;


import java.io.Console;
import java.util.logging.FileHandler;

import javax.swing.text.View;

import FamilyTree.model.familyTree.FamilyTree;
import FamilyTree.model.familyTree.Human;
import FamilyTree.model.human.Gender;


public class main {
     public static void main(String[] args) {
        FamilyTree<Human> tree = new FamilyTree<>();

        tree.add(new Human("Александр", Gender.Male));
        tree.add(new Human("Татьяна", Gender.Female));
        tree.add(new Human("Вероника", Gender.Female,
                tree.getByName("Александр"), tree.getByName("Татьяна")));
        tree.add(new Human("Леонид", Gender.Male,
                tree.getByName("Александр"), tree.getByName("Татьяна")));

        FamilyTreeService service = new FamilyTreeService();
        service.setWritable(new FileHandler());
        service.load();
        View view = new Console();
        new Presenter(view, service);

        view.start();
    }
}

package FamilyTree.model.Comporator;

import java.util.Comparator;

import FamilyTree.model.familyTree.Human;

public class ComporatorAge implements Comparator<Human> {

    @Override
    public int compare(Human o1, Human o2) {

        return Integer.compare(o1.getAge(), o2.getAge());
    }

}

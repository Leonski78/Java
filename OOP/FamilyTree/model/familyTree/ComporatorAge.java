package FamilyTree.model.familyTree;

import java.util.Comparator;

public class ComporatorAge implements Comparator<Human> {

    @Override
    public int compare(Human o1, Human o2) {

        return Integer.compare(o1.getAge(), o2.getAge());
    }

}

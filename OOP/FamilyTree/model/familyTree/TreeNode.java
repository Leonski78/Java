package FamilyTree.model.familyTree;

import java.time.LocalDate;
import java.util.List;


    public interface TreeNode<T extends TreeNode> {
    T getFather();
    T getMother();
    boolean addChild(T human);
    String getName();
    String getInfo();
    LocalDate getDeathDate();
    LocalDate getBirthDate();
    List<T> getChildren();
}


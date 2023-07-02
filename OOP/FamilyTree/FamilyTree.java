package FamilyTree;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.tree.TreeNode;

    public class FamilyTree<T extends TreeNode<T>> implements Serializable, Iterable<T> {
    private List<T> humanList;

    public FamilyTree() {
        this(new ArrayList<>());
    }

    public FamilyTree(List<T> humanList) {
        this.humanList = humanList;
    }

    public boolean add(T human){
        if (human == null) {
            return false;
        }
        if (!humanList.contains(human)){
            humanList.add(human);
            if (human.getFather() != null){
                human.getFather().addChild(human);
            }
            if (human.getMother() != null){
                human.getMother().addChild(human);
            }
            return true;
        }
        return false;
    }

    public T getByName(String name){
        for (T human: humanList){
            if (human.getName().equals(name)){
                return human;
            }
        }
        return null;
    }

    public String getInfo(){
        StringBuilder sb = new StringBuilder();
        sb.append("В дереве ");
        sb.append(humanList.size());
        sb.append(" объектов: \n");
        for (T human: humanList){
            sb.append(human.getInfo());
            sb.append("\n");
        }
        return sb.toString();
    }

    public void sortByName(){
        humanList.sort(new FamilyTreeComparatorByName<>());
    }

    public void sortByDeathDate(){
        humanList.sort(new FamilyTreeComparatorByDeathDate<>());
    }

    @Override
    public Iterator<T> iterator() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'iterator'");
    }
}

package FamilyTree.model.familyTree;

import java.io.Serializable;

public interface LoadSave {
    Serializable load(String path);
    void save(String path, Serializable obj);
}

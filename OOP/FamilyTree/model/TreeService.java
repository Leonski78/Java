// package FamilyTree.model;


// import model.familyTree.FamilyTree;
// import model.human.Gender;
// import model.human.Human;
// import model.save.Writable;

// import java.time.LocalDate;

// public class TreeService {
//     private Writable writable;
//     private final String filePath = "tree.txt";
//     private FamilyTree<Human> activeTree;

//     public TreeService(FamilyTree<Human> activeTree) {
//         this.activeTree = activeTree;
//     }

//     public TreeService(){
//         activeTree = new FamilyTree<>();
//     }

//     public boolean save(){
//         if (writable == null){
//             return false;
//         }
//         return writable.save(activeTree, filePath);
//     }

//     public boolean load(){
//         if (writable == null){
//             return false;
//         }
//         activeTree = (FamilyTree<Human>) writable.read(filePath);
//         if (activeTree == null){
//             activeTree = new FamilyTree<>();
//         }
//         return true;
//     }

//     public String addHuman(String name, Gender gender, LocalDate birthDate, String father, String mother){
//         Human humanFather = findHuman(father);
//         Human humanMother = findHuman(mother);
//         Human human = new Human(name, gender, humanFather, humanMother);
//         activeTree.add(human);
//         return "Человек успешно добавлен в дерево";
//     }

//     private Human findHuman(String name) {
//         if (name != null){
//             return activeTree.getByName(name);
//         }
//         return null;
//     }

//     public void setWritable(Writable writable) {
//         this.writable = writable;
//     }

//     public void sortByName(){
//         activeTree.sortByName();
//     }

//     public void sortByDeathDate(){
//         activeTree.sortByDeathDate();
//     }

//     public String getHumanList() {
//         return activeTree.getInfo();
//     }
// }

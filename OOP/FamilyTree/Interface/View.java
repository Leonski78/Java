import FamilyTree.Presenter.Presenter;

package FamilyTree.Interface;

public interface View {
    void setPresenter(Presenter presenter);

    void start();

    void print(String text);

    String scan();
}
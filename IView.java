import javax.swing.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public interface IView {
    void setList(String newList);
    void lyListener(ActionListener mal);
    JButton getRemove();
    JButton getAddFromF();
    JButton getSearch();
    JButton getAdd();
    JButton getSet();
    String getUserInputSearch();
    String getUserInputMeaning();
   void setMeaning(String meaning);

}

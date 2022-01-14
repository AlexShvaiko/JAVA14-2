import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Controller implements IController{
    private IModel m_model;
    private IView  m_view;



    Controller(IModel model, IView view) {
        m_model = model;
        m_view = view;
        m_view.setList(m_model.getListString());
        m_view.lyListener(new Listener ());
        m_view.setList(m_model.getListString());

    }

class Listener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
if(e.getSource()==m_view.getRemove()) {
    m_model.remove(m_view.getUserInputSearch());
}
    if(e.getSource()==m_view.getSearch()){
      String meaning = m_model.search(m_view.getUserInputSearch()).getMeaning() ;
       m_view.setMeaning(meaning);
}
        if(e.getSource()==m_view.getAdd()){
            m_model.addT(m_view.getUserInputSearch(),m_view.getUserInputMeaning());
        }

        if(e.getSource()==m_view.getSet()){
            m_model.remove(m_view.getUserInputSearch());
            m_model.addT(m_view.getUserInputSearch(),m_view.getUserInputMeaning());
    }

        if(e.getSource()==m_view.getAddFromF()){
            m_model.addFromFile(m_view.getUserInputSearch());
        }m_view.setList(m_model.getListString());
    }

}
}

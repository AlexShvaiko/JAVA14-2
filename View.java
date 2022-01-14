import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

public class View extends JFrame implements IView{
    private JTextField term= new JTextField();
    private JTextField meaning   = new JTextField();
    private JButton    add = new JButton("Add");
    private JButton    set = new JButton("Set");
    private JButton    search  = new JButton("search");
    private JButton   addFromF = new JButton("File");
    private JButton   remove = new JButton("remove");
    private JPanel listPanel = new JPanel();
    private JTextArea textArea;


    private IModel m_model;




    View(IModel model)
{
    m_model = model;
    JPanel input=new JPanel(new GridLayout(1, 4));
    this.setLayout(new BorderLayout());
    setVisible(true);
    JPanel panel = new JPanel();
    JPanel host = new JPanel(new BorderLayout());
    panel.setLayout(new GridLayout(1, 4));
    listPanel.setLayout(new FlowLayout());
    host.add(input,BorderLayout.NORTH);
    host.add(panel,BorderLayout.SOUTH);
    input.add(new JLabel("Term/File"));
    input.add(term);
    input.add(new JLabel("Meaning"));
    showScroll();
    textArea.setEditable(false);
    input.add(meaning);
    panel.add(search);
    panel.add(addFromF);
    panel.add(add);
    panel.add(set);
    panel.add(remove);
    add(host, BorderLayout.NORTH);
    add(listPanel,BorderLayout.CENTER);
    pack();




    this.setTitle("My project");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

}
    public JButton getSet() {
        return set;
    }
    public JButton getAdd() {
        return add;
    }

    public JButton getSearch() {
        return search;
    }

    public JButton getAddFromF() {
        return addFromF;
    }

    public JButton getRemove() {
        return remove;
    }
    public void lyListener(ActionListener mal) {
        remove.addActionListener(mal);
        addFromF.addActionListener(mal);
        search.addActionListener(mal);
        add.addActionListener(mal);
        set.addActionListener(mal);
    }

    public void setMeaning(String s) {
        meaning.setText(s);
    }

    public void setList(String newList) {textArea.setText(newList);

    }
    public String getUserInputSearch() {
        return term.getText();
    }
    public String getUserInputMeaning() {
        return meaning.getText();
    }
    private void showScroll() {
        textArea=new JTextArea(20,20);
        JScrollPane  scroll= new JScrollPane(textArea);
        scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        listPanel.add(scroll);


    }


}

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Model implements IModel{
private  TreeSet<Term> list;;
private String listString="";

    Model()
    {
        list=new TreeSet<Term>();

    }

    public  String getListString() {
        return listString;
    }

    public void listString()
{
    listString= "";
    Iterator it=list.iterator();
    while(it.hasNext())
    {
        listString=listString+it.next();
    }
}
public void remove(String term)
{
           list.remove(new Term(term,""));
           listString();
}


public void addT(String term,String meaning)
{
    if(meaning.isEmpty())
    {
        return;
    }
    list.add(new Term(term,meaning));
    listString();

}
public void addFromFile(String name){
    Scanner input = null;
    try {
        input = new Scanner(new File(name+".txt"));
    } catch (FileNotFoundException e) {
JOptionPane.showMessageDialog(new JFrame(),"file not found");
        return;

    }

    while (input.hasNext()){
        String st1 = input.nextLine();
        String st2 = input.nextLine();
        addT(st1,st2 );
    }
    input.close();

}



    public Term search(String term) {

        Iterator it= list.iterator();
        Term temp=(Term) it.next();
        Term val=new Term(term,"");
        while(it.hasNext())
        {
            if(temp.equals(val)){
                return temp;
            }
            temp=(Term) it.next();
        }

      return new Term(term,"not found");

    }
    public  void set(String term,String meaning ){
        list.add(new Term(term,meaning));
    }
}



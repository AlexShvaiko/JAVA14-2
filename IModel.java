import java.util.ArrayList;

public interface IModel {
    void addT(String term,String meaning);
    Term search(String term);
    String getListString();
    void listString();
    void remove(String term);
    void addFromFile(String name);
}

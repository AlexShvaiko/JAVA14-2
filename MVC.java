public class MVC {
    public static void main(String[] args) {
    IModel   model   = new Model();
    IView view= new View(model);
    IController controller = new Controller(model,view);}
}

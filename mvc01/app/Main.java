import model.ProgModel
import model.ProgViewer
import model.ProgController

public class Program {

    public static void main(String[] args) {

        // cria o Model
        Person model = new Person("Maria");

        // cria a View
        PersonView view = new PersonView();

        // cria o Controller
        PersonController controller = new PersonController(model, view);

        // mostra os dados
        controller.updateView();

        // muda o dado
        controller.setPersonName("João");

        // mostra novamente
        controller.updateView();
    }

}

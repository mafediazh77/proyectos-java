import model.ProgModel;
import view.ProgView;
import controller.ProgController;

public class Main {

    public static void main(String[] args) {

        ProgModel model = new ProgModel("Maria");
        ProgView view = new ProgView();

        ProgController controller = new ProgController(model, view);

        // mostra os dados
        controller.updateView();

        // muda o dado
        controller.setProgName("João");

        // mostra novamente
        controller.updateView();
    }

}

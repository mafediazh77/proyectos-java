
package controller;

import model.ProgModel;
import view.ProgView;

public class ProgController {

    private ProgModel model;
    private ProgView view;

    public ProgController(ProgModel model, ProgView view) {
        this.model = model;
        this.view = view;
    }

    public void setProgName(String name) {
        model.setName(name);
    }

    public String getProgName() {
        return model.getName();
    }

    public void updateView() {
        view.showProg(model.getName());
    }

}

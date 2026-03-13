
package controller;

public class PersonController {

    private ProgModel model;
    private ProgViewer view;

    public PersonController(ProgModel model, ProgViewer view) {
        this.model = model;
        this.view = view;
    }

    public void setPersonName(String name) {
        model.setName(name);
    }

    public String getPersonName() {
        return model.getName();
    }

    public void updateView() {
        view.showPerson(model.getName());
    }

}

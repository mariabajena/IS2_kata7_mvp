package mvp;

public class Presenter {

    private final View view;
    private final Model model;

    public Presenter(View view, Model model) {
        this.view = view;
        this.model = model;
    }

    public void login(String pass) {
        String result = "Incorrect Password! Try again: ";
        if (model.getPassword().equals(pass)) {
            result = "Correct Password";
            view.hideInputField();
            view.hideLoginButton();
        }

        view.updateStatusLabel(result);
    }

}

package mvp;

public class Main {
    // Se ensamblan todos los componentes de MVP: Modelo, Vista, Presentador
    public static void main(String[] args) {
        View view = new View();
        view.setPresenter(new Presenter(view, new Model()));
    }
}

package cenario5;

import cenario5.model.Evento;
import cenario5.view.EventoView;
import cenario5.controller.EventoController;

public class Programa {
    public static void main(String[] args) {
        Evento model = new Evento("Concerto", "20/06/2024", "Teatro Municipal", 500, 300, 50.0);
        EventoView view = new EventoView();
        EventoController controller = new EventoController(model, view);

        controller.atualizarView();
    }
}

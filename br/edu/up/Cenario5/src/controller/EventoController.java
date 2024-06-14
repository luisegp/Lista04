package cenario5.controller;

import cenario5.model.Evento;
import cenario5.view.EventoView;

public class EventoController {
    private Evento model;
    private EventoView view;

    public EventoController(Evento model, EventoView view) {
        this.model = model;
        this.view = view;
    }

    public void setNome(String nome) {
        model.setNome(nome);
    }

    public String getNome() {
        return model.getNome();
    }

    // Outros getters e setters
    // ...

    public void atualizarView() {
        view.exibirDetalhesEvento(model);
    }
}
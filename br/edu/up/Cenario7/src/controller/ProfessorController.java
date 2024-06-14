package cenario7.controller;

import cenario7.model.Professor;
import cenario7.view.ProfessorView;

public class ProfessorController {
    private Professor model;
    private ProfessorView view;

    public ProfessorController(Professor model, ProfessorView view) {
        this.model = model;
        this.view = view;
    }

    public void setNome(String nome) {
        model.setNome(nome);
    }

    public String getNome() {
        return model.getNome();
    }

    public void atualizarView() {
        view.exibirDetalhesProfessor(model);
    }
}

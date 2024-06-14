package cenario7.controller;

import cenario7.model.Disciplina;
import cenario7.view.DisciplinaView;

public class DisciplinaController {
    private Disciplina model;
    private DisciplinaView view;

    public DisciplinaController(Disciplina model, DisciplinaView view) {
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
        view.exibirDetalhesDisciplina(model);
    }
}

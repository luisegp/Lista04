package cenario7.controller;

import cenario7.model.Aluno;
import cenario7.view.AlunoView;

public class AlunoController {
    private Aluno model;
    private AlunoView view;

    public AlunoController(Aluno model, AlunoView view) {
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
        view.exibirDetalhesAluno(model);
    }
}

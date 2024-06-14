package cenario7.controller;

import cenario7.model.Pessoa;
import cenario7.view.PessoaView;

public class PessoaController {
    private Pessoa model;
    private PessoaView view;

    public PessoaController(Pessoa model, PessoaView view) {
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
        view.exibirDetalhesPessoa(model);
    }
}

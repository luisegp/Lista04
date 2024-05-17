package models;

public class Pessoal extends Contato {
    private String aniversario;

    public Pessoal(int codigo, String nome, String telefone, String aniversario) {
        super(codigo, nome, telefone);
        this.aniversario = aniversario;
    }

    public String getAniversario() {
        return aniversario;
    }

    @Override
    public String getDetalhes() {
        return "Aniversário: " + aniversario;
    }
}

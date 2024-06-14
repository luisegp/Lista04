package cenario7.model;

public class Professor extends Pessoa {
    private String lattesId;
    private String titulacao;

    public Professor(String nome, String rg, String matricula, String lattesId, String titulacao) {
        super(nome, rg, matricula);
        this.lattesId = lattesId;
        this.titulacao = titulacao;
    }

    public String getLattesId() {
        return lattesId;
    }

    public void setLattesId(String lattesId) {
        this.lattesId = lattesId;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }
}

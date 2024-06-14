package cenario3.model;

import java.time.LocalDateTime;

public class Compromisso {
    private String pessoa;
    private String local;
    private LocalDateTime horario;
    private String assunto;

    public Compromisso(String pessoa, String local, LocalDateTime horario, String assunto) {
        this.pessoa = pessoa;
        this.local = local;
        this.horario = horario;
        this.assunto = assunto;
    }

    public String getPessoa() {
        return pessoa;
    }

    public void setPessoa(String pessoa) {
        this.pessoa = pessoa;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public LocalDateTime getHorario() {
        return horario;
    }

    public void setHorario(LocalDateTime horario) {
        this.horario = horario;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }
}

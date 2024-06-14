// cenario7/model/Avaliacao.java
package cenario7.model;

import java.util.List;

public class Avaliacao {
    private Aluno aluno;
    private Disciplina disciplina;
    private List<Competencia> competencias;

    public Avaliacao(Aluno aluno, Disciplina disciplina, List<Competencia> competencias) {
        this.aluno = aluno;
        this.disciplina = disciplina;
        this.competencias = competencias;
    }

    public SituacaoAluno avaliar() {
        long necessariasAtingidas = competencias.stream()
                .filter(c -> c.getDescricao().equals("Necessária") && c.isAtingida())
                .count();

        long complementaresAtingidas = competencias.stream()
                .filter(c -> c.getDescricao().equals("Complementar") && c.isAtingida())
                .count();

        if (necessariasAtingidas >= 100 && complementaresAtingidas >= 50) {
            return SituacaoAluno.APROVADO;
        } else if (necessariasAtingidas < 50 || complementaresAtingidas < 50) {
            return SituacaoAluno.REPROVADO;
        } else {
            return SituacaoAluno.PENDENTE;
        }
    }

    // Getters e Setters
    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public List<Competencia> getCompetencias() {
        return competencias;
    }

    public void setCompetencias(List<Competencia> competencias) {
        this.competencias = competencias;
    }
}

package cenario7.view;

import cenario7.model.Disciplina;

public class DisciplinaView {
    public void exibirDetalhesDisciplina(Disciplina disciplina) {
        System.out.println("Nome: " + disciplina.getNome());
        System.out.println("Identificador: " + disciplina.getIdentificador());
        System.out.println("Currículo: " + disciplina.getCurriculo());
        System.out.println("Competências Necessárias: " + disciplina.getCompetenciasNecessarias());
        System.out.println("Competências Complementares: " + disciplina.getCompetenciasComplementares());
        System.out.println("Professor: " + disciplina.getProfessor().getNome());
        System.out.println("Alunos: ");
        for (Aluno aluno : disciplina.getAlunos()) {
            System.out.println("  - " + aluno.getNome());
        }
        System.out.println();
    }
}

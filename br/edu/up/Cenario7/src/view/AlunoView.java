package cenario7.view;

import cenario7.model.Aluno;

public class AlunoView {
    public void exibirDetalhesAluno(Aluno aluno) {
        System.out.println("Nome: " + aluno.getNome());
        System.out.println("RG: " + aluno.getRg());
        System.out.println("Matrícula: " + aluno.getMatricula());
        System.out.println("Ano de Ingresso: " + aluno.getAnoIngresso());
        System.out.println("Curso: " + aluno.getCurso());
        System.out.println("Turno: " + aluno.getTurno());
        System.out.println();
    }
}

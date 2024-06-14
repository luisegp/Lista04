package cenario7.view;

import cenario7.model.Professor;

public class ProfessorView {
    public void exibirDetalhesProfessor(Professor professor) {
        System.out.println("Nome: " + professor.getNome());
        System.out.println("RG: " + professor.getRg());
        System.out.println("Matrícula: " + professor.getMatricula());
        System.out.println("Lattes ID: " + professor.getLattesId());
        System.out.println("Titulação: " + professor.getTitulacao());
        System.out.println();
    }
}

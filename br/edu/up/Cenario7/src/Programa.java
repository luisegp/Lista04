// cenario7/Programa.java
package cenario7;

import cenario7.model.Aluno;
import cenario7.model.Disciplina;
import cenario7.model.Professor;
import cenario7.view.AlunoView;
import cenario7.view.DisciplinaView;
import cenario7.view.ProfessorView;
import cenario7.controller.AlunoController;
import cenario7.controller.DisciplinaController;
import cenario7.controller.ProfessorController;

import java.util.Arrays;

public class Programa {
    public static void main(String[] args) {
        Professor professor = new Professor("Dr. João", "123456", "98765", "1234", "Doutorado");
        Aluno aluno1 = new Aluno("Maria", "654321", "87654", 2020, "Engenharia", "Matutino");
        Aluno aluno2 = new Aluno("Pedro", "543210", "76543", 2019, "Medicina", "Noturno");
        
        Disciplina disciplina = new Disciplina("Algoritmos", "ALG101", "Currículo 2024", 
            Arrays.asList("Lógica", "Programação"), Arrays.asList("Documentação", "Testes"), professor, Arrays.asList(aluno1, aluno2));

        ProfessorView professorView = new ProfessorView();
        AlunoView alunoView = new AlunoView();
        DisciplinaView disciplinaView = new DisciplinaView();

        ProfessorController professorController = new ProfessorController(professor, professorView);
        AlunoController alunoController1 = new AlunoController(aluno1, alunoView);
        AlunoController alunoController2 = new AlunoController(aluno2, alunoView);
        DisciplinaController disciplinaController = new DisciplinaController(disciplina, disciplinaView);

        professorController.atualizarView();
        alunoController1.atualizarView();
        alunoController2.atualizarView();
        disciplinaController.atualizarView();
    }
}

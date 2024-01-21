package oo.composicao.escola;

import java.util.ArrayList;
import java.util.List;

public class Curso {

    final String nome;
    final List<Aluno> alunos = new ArrayList<>();

    // Construtor que recebe uma String e atribui ao atributo 'nome'
    Curso(String nome){
        this.nome = nome;
    }

    // Método onde vincula o aluno X no curso Y e o curso Y no aluno X
    void adicionarAluno (Aluno aluno){
        this.alunos.add(aluno);
        aluno.cursos.add(this);
    }

    boolean verificarMatricula(String nome){
        for(Aluno aluno: this.alunos){
            if(aluno.nome.equalsIgnoreCase(nome)){
                return true;
            }
        }
        return false;
    }

}

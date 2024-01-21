package oo.composicao.escola;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

    final String nome;
    final List<Curso> cursos = new ArrayList<>();

    // Construtor que recebe uma String e atribui ao atributo 'nome'
    Aluno(String nome){
        this.nome = nome;
    }

    // Método que vincula o curso X ao aluno Y e o aluno Y ao cusro X
    void adicionarCurso(Curso curso){
        this.cursos.add(curso);
        curso.alunos.add(this);
    }

    public String toString(){
        return "Nome: " + nome;
    }

}

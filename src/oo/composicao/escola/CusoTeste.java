package oo.composicao.escola;

// Estudo de composição onde utilizamos o vinculo N para N

public class CusoTeste {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("João");
        Aluno aluno2 = new Aluno("Gustavo");
        Aluno aluno3 = new Aluno("Lucas");

        Curso curso1 = new Curso("Java Completo");
        Curso curso2 = new Curso("C# Completo");
        Curso curso3 = new Curso("Python Completo");

        curso1.adicionarAluno(aluno1);
        curso2.adicionarAluno(aluno3);

        curso3.adicionarAluno(aluno2);
        curso3.adicionarAluno(aluno3);
        curso3.adicionarAluno(aluno1);

        aluno2.adicionarCurso(curso1);
        aluno2.adicionarCurso(curso2);

        for(Aluno aluno: curso1.alunos){
            System.out.println("Estou matriculado no curso " + curso1.nome);
            System.out.println("E meu nome é " + aluno.nome);
        }

        System.out.println("Meu nome é " + aluno2.nome);
        System.out. println("E eu estou matriculado nos seguintes cursos: \n");
        for(Curso curso: aluno2.cursos){
            System.out. println(curso.nome);
        }

        System.out.println(curso1.alunos);
        System.out.println("\n\n");

        String nome = "Otávio";
        if(curso3.verificarMatricula(nome)){
            System.out.printf("%s está matriculado no curso %s", nome, curso3.nome);
        }else{
            System.out.printf("%s não matriculado no curso %s", nome, curso3.nome);
        }


    }
}

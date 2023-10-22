import java.util.ArrayList;

public class Curso {
    String nome;
    ArrayList<Aluno> alunos = new ArrayList<>();

    void adcionarAluno(Aluno aluno){
        //creating the bidimensional relation 
        this.alunos.add(aluno);
        //when add and aluno in the array cursos.alunos this new aluno will addd in their array aluno.cursos this Curso automatically
        aluno.cursos.add(this);
    }
    public String toString(){
        return nome;
    }
}

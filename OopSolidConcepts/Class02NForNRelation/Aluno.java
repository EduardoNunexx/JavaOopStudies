import java.util.ArrayList;

public class Aluno {
    String nome;
    ArrayList<Curso> cursos= new ArrayList<>();
    void adcionarCurso(Curso curso){
        //when i add a new curso in the aluno.cursos array this aluno will be placced in the curso.alunos 
        this.cursos.add(curso);
        //im doing this here when i call "this" 
        curso.alunos.add(this);
    }
    Aluno(String nome){
        this.nome=nome;
    }
    public String toString(){
        return nome;
    }
}

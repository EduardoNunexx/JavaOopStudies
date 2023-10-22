
public class Lession3Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("aluno1");
        Aluno aluno2= new Aluno("Aluno2");
        Aluno aluno3= new Aluno("Aluno3");
        Aluno aluno4= new Aluno("Aluno4");
        Aluno aluno5= new Aluno("Aluno5");
        Curso curso1 = new Curso();

        //when i do this automatcally the curso1 will add the aluno1 in your alunos array 
        aluno1.adcionarCurso(curso1);
        
        System.out.println(curso1.toString());

        aluno2.adcionarCurso(curso1);
        aluno3.adcionarCurso(curso1);
        aluno4.adcionarCurso(curso1);
        aluno5.adcionarCurso(curso1);
        System.out.println(aluno1.cursos.get(0).alunos.toString());
    }
}

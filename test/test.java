import DAO.AlunoDAO;
import DAO.CursoDAO;
import DAO.IAlunoDAO;
import DAO.ICursoDAO;
import DOMAIN.Aluno;
import DOMAIN.Curso;
import org.junit.Test;

public class test {

    private ICursoDAO daoCurso;
    private IAlunoDAO daoAluno;
    public test(){
        daoAluno = new AlunoDAO();
        daoCurso = new CursoDAO();
    }

    @Test
    public void cadastrar() {

        Curso curso = new Curso();
        curso.setCodigo("A1");
        curso.setDescricao("CursoA");
        curso.setNome("Java");

        daoCurso.cadastrar(curso);
        Aluno aluno = new Aluno();
        aluno.setNome("Pedro");
        aluno.setCurso(curso);
        daoAluno.cadastrar(aluno);


    }


}
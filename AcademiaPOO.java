package academiapoo;

public class AcademiaPOO {

    public static void main(String[] args) {

        Aluno aluno = new Aluno("Isabelle", 18, 12345, "Emagrecimento");

        Professor professor = new Professor(
                "Carlos",
                30,
                "Musculação",
                "CREF123456"
        );

        System.out.println("===== ALUNO =====");
        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Idade: " + aluno.getIdade());
        System.out.println("Matrícula: " + aluno.getMatricula());
        System.out.println("Objetivo: " + aluno.getObjetivo());

        aluno.apresentar();

        aluno.cadastrar();
        aluno.cadastrar("Ganho de massa muscular");

        System.out.println();

        System.out.println("===== PROFESSOR =====");
        System.out.println("Nome: " + professor.getNome());
        System.out.println("Idade: " + professor.getIdade());
        System.out.println("Especialidade: " + professor.getEspecialidade());
        System.out.println("CREF: " + professor.getCref());

        professor.apresentar();
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int alunos;
        int provas;
        String[][] alunosEProvas;

        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos alunos serão cadastrados?");
        alunos = sc.nextInt();
        System.out.println("Quantas provas foram realizadas?");
        provas = sc.nextInt();
        alunosEProvas = new String[alunos][provas];

        for (int i = 0; i < alunos; i++) {
            double somaNotas = 0;
            for (int j = 0; j < provas; j++) {
                System.out.println("Aluno nº" + (i + 1) + " Insira a nota da prova nº" + (j+1));
                somaNotas += sc.nextDouble();
            }
            System.out.println("Aluno nº" + (i + 1) + " Média: " + (somaNotas / provas));
        }
    }

}

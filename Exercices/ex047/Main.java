import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] nomes;
        String nome;
        int quantidadeNomes;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade de nomes: ");
        quantidadeNomes = sc.nextInt();
        nomes = new String[quantidadeNomes];
        for (int i = 0; i < quantidadeNomes; i++) {
            System.out.println("Digite o nome: ");
            nomes[i] = sc.next();
        }
        for (int i = 0; i < quantidadeNomes; i++) {
            System.out.println(nomes[i]);
        }


    }
}

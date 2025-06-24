import java.util.Scanner;

public class ex005 {
    public static void main(String[] args) {
        System.out.println(menu(5));
    }
    public static int menu(int quantidade){
        Scanner sc = new Scanner(System.in);
        int contador = 0;
        int acc = 0;
        while (contador < quantidade) {
            System.out.printf("Diigite o número #%d: ", contador + 1);
            String entrada = sc.nextLine();

            try {
                int numero = Integer.parseInt(entrada);
                acc += numero;
                contador++;
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, digite um número inteiro.");
            }
        }
            return acc;
    }

}


import java.util.Scanner;

public class ex005 {
    public static void main(String[] args) {
        System.out.println(menu());
    }
    public static int menu(){
            Scanner sc = new Scanner(System.in);
            int contador = 0;
            int acc = 0;
            do{
                System.out.println("Digite o numero#" + (contador + 1) + ": ");
                String num = sc.nextLine();
                try{
                    int numCerto = Integer.parseInt(num);
                    contador++;
                    acc += numCerto;
                }catch(NumberFormatException e){
                    System.out.println("Erro ao tentar inserir um numero");
                }
            }while(contador < 5);
            return acc;
    }

}


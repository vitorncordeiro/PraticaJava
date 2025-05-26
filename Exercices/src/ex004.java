public class ex004 {
    public static void main(String[] args) {
        int numero = 98716543321;
        System.out.println(medirCaracteres(numero));
    }
    public static int medirCaracteres(int numero){
        String numeroString = String.valueOf(numero);
        int numeroInvertido = numeroString.length();
        return numeroInvertido;
    }
}

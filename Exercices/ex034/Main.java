public class Main {
    public static void main(String[] args) {
        Customer contaVitor = new Customer("Vitor Natal Cordeiro", 1000, "vitor@gmail.com");
        System.out.println(contaVitor.getCreditLimit());
        System.out.println(contaVitor.getName());
        System.out.println(contaVitor.getEmail());

        Customer novaConta = new Customer("Arlindo", "arlindinho@gmail.com");
        System.out.println(novaConta.getCreditLimit());
        System.out.println(novaConta.getName());
        System.out.println(novaConta.getEmail());

    }
}
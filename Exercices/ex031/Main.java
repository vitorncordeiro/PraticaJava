public class Main {
    public static void main(String[] args) {
        Banco contaVitor = new Banco();
        contaVitor.setName("Vitor");
        contaVitor.setBalance(0);
        contaVitor.setEmail("vitorr@gmail.com");
        contaVitor.setAccountNumber(123);
        contaVitor.setPhone("999");

        System.out.println(contaVitor.getBalance());
        contaVitor.deposit(10);
        System.out.println("Saldo depois do depósito: ");
        System.out.println(contaVitor.getBalance());

        contaVitor.withdraw(5);
        System.out.println("Saldo depois do saque:");
        System.out.println(contaVitor.getBalance());

    }
}

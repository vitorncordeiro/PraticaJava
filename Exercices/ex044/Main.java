public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer(80, false);

        printer.addToner(30);
        System.out.println(printer.getTonerLevel());
        printer.printPages(50);
        System.out.println(printer.getPagesPrinted());
    }
}

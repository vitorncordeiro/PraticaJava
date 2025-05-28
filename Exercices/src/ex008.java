public class MegaBytesConverter {
    // write code here
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if (kiloBytes < 0){
            System.out.println("Invalid Value");
        }else{
        int mB = 1024;
        int resultadoMb = kiloBytes / mB;
        int restoKB = kiloBytes % mB;
        System.out.println(kiloBytes + " KB = " + resultadoMb + " MB and " + restoKB + " KB");
        }
    }
}
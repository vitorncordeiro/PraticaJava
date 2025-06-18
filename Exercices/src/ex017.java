public class ex005 {
    public static void main(String[] args) {
        System.out.println(getDurationString(10000));
        System.out.println(getDurationString(10, 90));

    }
    public static String getDurationString(int seconds){
        if (seconds < 0){
            return "Insira um valor válido de segundos";
        }
        int hour = seconds/3600;
        seconds %= 3600;
        int minutes = seconds/60;
        seconds %= 60;
        String string = hour + "h" + minutes + "m" + seconds + "s";
        return string;
    }
    public static String getDurationString(int seconds, int minutes){
        if (minutes < 0 && seconds < 0 && seconds > 59){
            return "Insira um valor válido! Segundos devem ser menores que 59, Minutos e Segundos maiores ou iguais a zero";
        }
        int hour = minutes/60;
        minutes %= 60;
        String string = hour + "h" + minutes + "m" + seconds + "s";
        return string;
    }
}

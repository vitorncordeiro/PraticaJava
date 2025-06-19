public class ex005 {
    public static void main(String[] args) {
        for (int i = 0; i <= 8; i++) {
            System.out.println(printDayOfWeek(i));
        }

        }
    public static String printDayOfWeek(int day){
        return switch(day){
            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Invalid day";
        };
    }
}

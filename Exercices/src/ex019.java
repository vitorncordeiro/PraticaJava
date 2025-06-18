public class MinutesToYearsDaysCalculator {
    public static void printYearsAndDays(long minutes){
        if(minutes < 0){
            System.out.println("Invalid Value");
            return;
        }
        long years = minutes / 525600;
        long remaining_minutes = minutes % 525600;
        long days = remaining_minutes / 1440;
        System.out.println(minutes + " min = " + years + " y and " + days + " d");
    }
}

public class SpeedConverter {
    // write code here
    public static long toMilesPerHour(double kilometersPerHour){
        double converter = 1.609;
        if (kilometersPerHour < 0){
            return -1;
        }else{
         double convertedValue = kilometersPerHour / converter;
         long lonNum =Math.round(convertedValue);
            return lonNum;
        }
    }
    public static void printConversion(double kilometersPerHour){
        long resultado = toMilesPerHour(kilometersPerHour);
        if (kilometersPerHour >= 0){
        System.out.println(kilometersPerHour + " km/h = " + resultado + " mi/h");
        }else{
            System.out.println("Invalid Value");
        }
            
    }
}
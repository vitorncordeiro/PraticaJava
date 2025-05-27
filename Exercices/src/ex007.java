public class SpeedConverter {
    // write code here
    public static long toMilesPerHour(double kilometersPerHour){
        double converter = 1.609344;
        if (kilometersPerHour < 0){
            return -1;
        }else{
            long convertedValue =  Double kilometersPerHour / converter;
            return convertedValue;
        }
    }
}

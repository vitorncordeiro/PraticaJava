public class DecimalComparator {
    // write code here
    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2){
        double num1Truncado = (int) (num1 * 1000);
        double num2Truncado = (int) (num2 * 1000);
        if (num1Truncado == num2Truncado){
            return true;
        }else{
            return false;
        }
    }
}

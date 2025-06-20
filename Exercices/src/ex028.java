public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number){
        if(number < 0){
            return -1;
        };
        int last = number % 10;
        int first = 0;
        int original = number;
        while(original > 0){
            int lastDigit = original % 10;
            first = original;
            original = (original - lastDigit) / 10;
            
        }
        return first + last;
    }
}

public class NumberPalindrome {
    public static boolean isPalindrome(int num) {
        int bckp = Math.abs(num); // Considera valor absoluto
        int reverse = 0;
        int temp = bckp;

        while (temp > 0) {
            int lastDigit = temp % 10;
            reverse = reverse * 10 + lastDigit;
            temp = temp / 10;
        }

        return reverse == bckp;
    }
}

public class ex002 {
    public static void main(String[] args) {
        double myFirstDouble = 20;
        double mySecondDouble = 80;
        double myLastDouble = (myFirstDouble + mySecondDouble) * 100;
        double myRestDouble = myLastDouble % 40;
        boolean isZero = (myRestDouble == 0) ? true : false;
        System.out.println(isZero);
        if (!isZero) {
            System.out.println("Got some remainder");
        }
    }
}

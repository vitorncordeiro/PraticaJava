public class ex005 {
    public static void main(String[] args) {
        int counter = 0;
        int counterTimes = 0;
        for(int i = 1; i <= 1000; i++){
            if(counterTimes > 4){
                break;
            }
            if(i % 3 == 0 && i % 5 == 0){
                counter += i;
                System.out.println(i);
                counterTimes++;
            }
        }
        System.out.println("A soma é " + counter);
    }

}


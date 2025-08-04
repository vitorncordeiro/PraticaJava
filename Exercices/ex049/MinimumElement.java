import java.util.Scanner;

public class MinimumElement {
    private static int readInteger(){
        Scanner sc = new Scanner(System.in);
        int myQuantity = sc.nextInt();
        return myQuantity;
    }
    private static int[] readElements(int quantity){
        int[] intArray = new int[quantity];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < quantity; i++){
            intArray[i] = sc.nextInt();
        }
        return intArray;
    }
    
    private static int findMin(int[] myArray){
        int minNum = myArray[0];
        for(int i = 0; i < myArray.length; i++){
            if(minNum > myArray[i]){
                minNum = myArray[i];
            }
        }
        return minNum;
    }
}

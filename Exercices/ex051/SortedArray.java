import java.util.Scanner;
import java.util.Arrays;

public class SortedArray {

    public static int[] getIntegers(int size){
        Scanner sc = new Scanner(System.in);
        int[] unsortedArray = new int[size];
        for(int i = 0; i < size; i++){
            unsortedArray[i] = sc.nextInt();
        }
        return unsortedArray;
    }
    public static void printArray(int[] array){
        for(int i=0; i < array.length; i++){
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] unsortedArray){
        Arrays.sort(unsortedArray);
        int[] lastArray = new int[unsortedArray.length];
        int j = unsortedArray.length - 1;
        for(int i = 0; i < lastArray.length; i++){
            lastArray[i] = unsortedArray[j];
            j --;
        }
        return lastArray;
    }
}
    
 

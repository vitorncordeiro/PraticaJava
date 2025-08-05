public class ReverseArray {
    private static void reverse(int[] myArray){
        
        System.out.println("Array = [" + format(myArray) + "]");
        
        
        int[] myReverseArray = new int[myArray.length];
        int control = 0;
        for(int i = myArray.length - 1; i > 0; i--){
            myReverseArray[control] = myArray[i];
            control ++;
        }
        System.out.println("Array = [" + format(myReverseArray) + "]");
        
    }
    private static String format(int[] myArray){
        String arrayToString = "";
        for(int i = 0; i <= myArray.length - 1; i++){
            if(i == myArray.length - 1){
                arrayToString += myArray[i];    
            }else{
                arrayToString += myArray[i] + ", ";
            }
            
        }
        return arrayToString;
    }
}

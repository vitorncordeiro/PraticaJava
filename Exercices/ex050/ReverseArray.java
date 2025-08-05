public class ReverseArray {
    private static void reverse(int[] myArray){
        String arrayToString = "";
        for(int i = 0; i <= myArray.length - 1; i++){
            if(i == myArray.length - 1){
                arrayToString += myArray[i];    
            }else{
                arrayToString += myArray[i] + ", ";
            }
            
        }
        System.out.println("Array = [" + arrayToString + "]");
        
        
        int[] myReverseArray = new int[myArray.length];
        int control = 0;
        for(int i = myReverseArray.length - 1; i > -1; i--){
            myReverseArray[control] = myArray[i];
            control ++;
        }
        
        String reverseArrayToString = "";
        for(int i = 0; i <= myReverseArray.length - 1; i++){
            if(i == myReverseArray.length - 1){
                reverseArrayToString += myReverseArray[i];
            }else{
                reverseArrayToString += myReverseArray[i] + ", ";
            }
        }
        System.out.println("Reversed Array = [" + reverseArrayToString + "]");
        
    }
    
}

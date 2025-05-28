public class TeenNumberChecker {
    // write code here
    
    public static boolean hasTeen(int x, int y, int z){
        int min = 13;
        int max = 19;
        if((x >= min && x <= max) || (y >= min && y <= max) || (z >= min && z <= max) ){
            return true;
        }else{
            return false;
        }
    }
    public static boolean isTeen(int idade){
        int min = 13;
        int max = 19;
        if (idade <= max && idade >= min){
            return true;
        }else{
            return false;
        }
    }
}

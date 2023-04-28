package Home1;
public class HTask2 {
    public static int sum2d(String[][] arr) throws ArrayIndexOutOfBoundsException, NumberFormatException,IndexOutOfBoundsException,NullPointerException{ 
        int sum =0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 5; j++) {
                int val = Integer.parseInt(arr[i][j]);
                sum +=val;
            }
        }
        return sum; 
        
    }
   

}

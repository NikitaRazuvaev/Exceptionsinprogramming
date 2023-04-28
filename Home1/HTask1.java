package Home1;
/**
 * HTask1
 */
public class HTask1 {

    public static void main(String[] args) {
    
        try {
           int a[] = new int[8];
           a[4]=30/0;
           System.out.println("First print statement in try block");

        } catch (ArithmeticException e) {
            System.out.println("Warning: ArithmeticException");
        }

        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Warning: ArrayIndexOutOfBoundsException");
         }

        catch (Exception e) {
            System.out.println("Exception occurred");
            
        }
        System.out.println("I'm out of try-catch block in Java.");
        
    }
}
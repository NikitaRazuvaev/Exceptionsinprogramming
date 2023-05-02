package Home2;

import java.util.InputMismatchException;
import java.util.Scanner;

/*  
    Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), 
    и возвращает введенное значение. 
    Ввод текста вместо числа не должно приводить к падению приложения, 
    вместо этого, необходимо повторно запросить у пользователя ввод данных. 
*/
public class Task1 {
    public static void main(String[] args) {
        processEnteredDate();
    }
    public static float numberFloat() {
        System.out.println("Введите дробное число через запятую:");
        try (Scanner scanNum = new Scanner(System.in)) {
            float num = scanNum.nextFloat();
            System.out.println("Вы ввели:\n" + (num));
            return num;
        }
    }
    /**
     * @return
     */
    public static float processEnteredDate(){
        try{
            numberFloat();
        }
        catch(InputMismatchException e){
            System.out.println("Неверный ввод!");
            processEnteredDate();
    
        }
        return 0;
    }
    
}

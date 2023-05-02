package Home2;

public class Task2 {
    public static void main(String[] args) {
        task2();
    }

    public static void task2() {
        try {
            int[] intArray = { 14, 32, 34, 43, 35, 66, 778, 89, 10 };
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }

    }
}

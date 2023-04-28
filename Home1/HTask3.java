package Home1;

import java.util.Arrays;

public class HTask3 {
    public static void main(String[] args) {
        int[] array1 = {12, 21, 33, 44};
        int[] array2 = {50, 19, 80, 71, 55};
        System.out.println(Arrays.toString(method(array1, array2)));
    }

    public static int[] method(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            throw new ArrayIndexOutOfBoundsException("Different length of arrays");
        }
        int[] array = new int[array1.length];
        for (int i = 0; i < array1.length; i++) {
            array[i] = array1[i] - array2[i];
        }
        return array;
    }
}

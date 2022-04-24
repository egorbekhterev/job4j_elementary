package array;

public class Sorted {
    public static boolean isSorted(int[] array) {
        int temp = array[0];
        boolean result = true;
        for (int i = 1; i < array.length; i++) {
            if (temp < array[i]) {
                temp = array[i];
            } else {
            result = false;
            break;
            }
        }
        return result;
    }
}

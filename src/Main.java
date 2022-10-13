import java.util.Arrays;
import java.util.Random;

/**
 * Created by Mihran Galstyan
 * All rights reserved
 */
public class Main {
    public static void main(final String[] args) {
        int[] array = new int[40];
        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(0, 100);
        }

        System.out.println("Unsorted array");
        System.out.println(Arrays.toString(array));
        bubbleSortFromSmallToBig(array);
        System.out.println("BubbleSort from small to big");
        System.out.println(Arrays.toString(array));
        System.out.println("BubbleSort from big to small");
        bubbleSortFromBigToSmall(array);
        System.out.println(Arrays.toString(array));

    }

    public static void bubbleSortFromSmallToBig(int[] array) {
        for (int i = 0; i < array.length; i++) {
            boolean swapped = false;
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped)
                break;
        }
    }

    public static void bubbleSortFromBigToSmall(int[] array) {
        for (int i = 0; i < array.length; i++) {
            boolean swapped = false;
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped)
                break;
        }
    }
}


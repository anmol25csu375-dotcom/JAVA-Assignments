import java.util.Arrays;

public class ArrayTransformations {

    static void reverseInPlace(int[] values) {
        int left = 0;
        int right = values.length - 1;

        while (left < right) {
            int temp = values[left];
            values[left] = values[right];
            values[right] = temp;
            left++;
            right--;
        }
    }

    static int[] reversedCopy(int[] values) {
        int[] result = new int[values.length];

        for (int i = 0; i < values.length; i++) {
            result[i] = values[values.length - 1 - i];
        }

        return result;
    }

    static int removeValue(int[] values, int target) {
        int index = 0;

        for (int value : values) {
            if (value != target) {
                values[index] = value;
                index++;
            }
        }

        return index;
    }

    static int[] runningSum(int[] values) {
        int[] result = new int[values.length];
        int total = 0;

        for (int i = 0; i < values.length; i++) {
            total += values[i];
            result[i] = total;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] values = {1, 2, 3, 4, 5};
        reverseInPlace(values);
        System.out.println("Reversed in place: " + Arrays.toString(values));

        int[] original = {1, 2, 3, 4, 5};
        int[] copy = reversedCopy(original);
        System.out.println("Original: " + Arrays.toString(original));
        System.out.println("Reversed copy: " + Arrays.toString(copy));

        int[] removable = {3, 7, 3, 2, 3, 9};
        int length = removeValue(removable, 3);
        System.out.println("After removing: "
                + Arrays.toString(Arrays.copyOf(removable, length)));
        System.out.println("Logical length: " + length);

        int[] numbers = {2, -1, 4, 3};
        System.out.println("Running sum: "
                + Arrays.toString(runningSum(numbers)));
    }
}
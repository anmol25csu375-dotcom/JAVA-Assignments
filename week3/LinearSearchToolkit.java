import java.util.Arrays;

public class LinearSearchToolkit {

    static boolean contains(int[] values, int target) {
        for (int value : values) {
            if (value == target) {
                return true;
            }
        }
        return false;
    }

    static int firstIndexOf(int[] values, int target) {
        for (int i = 0; i < values.length; i++) {
            if (values[i] == target) {
                return i;
            }
        }
        return -1;
    }

    static int lastIndexOf(int[] values, int target) {
        for (int i = values.length - 1; i >= 0; i--) {
            if (values[i] == target) {
                return i;
            }
        }
        return -1;
    }

    static int countOccurrences(int[] values, int target) {
        int count = 0;
        for (int value : values) {
            if (value == target) {
                count++;
            }
        }
        return count;
    }

    static void test(int[] values, int target) {
        System.out.println("Array: " + Arrays.toString(values));
        System.out.println("Target: " + target);
        System.out.println("Contains: " + contains(values, target));
        System.out.println("First index: " + firstIndexOf(values, target));
        System.out.println("Last index: " + lastIndexOf(values, target));
        System.out.println("Occurrences: " + countOccurrences(values, target));
        System.out.println();
    }

    public static void main(String[] args) {
        test(new int[] {}, 7);                      
        test(new int[] {2, 4, 6, 8}, 5);            
        test(new int[] {7, 3, 5, 9}, 7);             
        test(new int[] {3, 5, 9, 7}, 7);             
        test(new int[] {4, 2, 4, 6, 4, 8}, 4);      
    }
}
import java.util.Scanner;

public class BitMaskUtility {

    static boolean isBitSet(int number, int position) {
        validatePosition(position);
        return (number & (1 << position)) != 0;
    }
    static int setBit(int number, int position) {
        validatePosition(position);
        return number | (1 << position);
    }
    static int clearBit(int number, int position) {
        validatePosition(position);
        return number & ~(1 << position);
    }
    static int toggleBit(int number, int position) {
        validatePosition(position);
        return number ^ (1 << position);
    }
    static String toBinary32(int number) {
        return String.format("%32s", Integer.toBinaryString(number))
                .replace(' ', '0');
    }
    static void validatePosition(int position) {
        if (position < 0 || position > 31) {
            throw new IllegalArgumentException("Position must be from 0 through 31.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = scanner.nextInt();

        System.out.print("Enter bit position (0-31): ");
        int position = scanner.nextInt();

        validatePosition(position);

        System.out.println("1. Check bit");
        System.out.println("2. Set bit");
        System.out.println("3. Clear bit");
        System.out.println("4. Toggle bit");
        System.out.print("Choose operation: ");
        int operation = scanner.nextInt();

        int result;
        boolean bitSet = false;

        switch (operation) {
            case 1:
                bitSet = isBitSet(number, position);
                result = number;
                break;
            case 2:
                result = setBit(number, position);
                break;
            case 3:
                result = clearBit(number, position);
                break;
            case 4:
                result = toggleBit(number, position);
                break;
            default:
                System.out.println("Invalid operation.");
                return;
        }

        System.out.println("Before decimal: " + number);
        System.out.println("Before binary:  " + toBinary32(number));

        if (operation == 1) {
            System.out.println("Bit is set: " + bitSet);
        }

        System.out.println("After decimal:  " + result);
        System.out.println("After binary:   " + toBinary32(result));
    }
}
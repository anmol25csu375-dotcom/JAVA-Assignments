public class StringFundamentals {

    static boolean hasText(String value) {
       
        for (int i = 0; i < value.length(); i++) {
            if (!Character.isWhitespace(value.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    static String normalizeCourseCode(String code) {
       
        return code.trim().toUpperCase();
    }

    static int countOccurrences(String text, char target) {
       
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == target) {
                count++;
            }
        }
        return count;
    }

    static int lengthOfLastWord(String text) {
       
        int end = text.length() - 1;
        while (end >= 0 && Character.isWhitespace(text.charAt(end))) {
            end--;
        }
        int start = end;
        while (start >= 0 && !Character.isWhitespace(text.charAt(start))) {
            start--;
        }
        return end - start;
    }

    static void reverseString(char[] characters) {
       
        int left = 0;
        int right = characters.length - 1;
        while (left < right) {
            char temp = characters[left];
            characters[left] = characters[right];
            characters[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        System.out.println("--- hasText ---");
        System.out.println("null: " + hasText(null));
        System.out.println("empty \"\": " + hasText(""));
        System.out.println("blank \"   \": " + hasText("   "));
        System.out.println("non-blank \"hi\": " + hasText("hi"));

        System.out.println("--- normalizeCourseCode ---");
        System.out.println("null: " + normalizeCourseCode(null));
        System.out.println("\"  cs101 \": " + normalizeCourseCode("  cs101 "));

        System.out.println("--- countOccurrences ---");
        System.out.println("null: " + countOccurrences(null, 'a'));
        System.out.println("\"banana\", 'a': " + countOccurrences("banana", 'a'));
        System.out.println("\"\", 'a': " + countOccurrences("", 'a'));

        System.out.println("--- lengthOfLastWord ---");
        System.out.println("null: " + lengthOfLastWord(null));
        System.out.println("\"Hello World\": " + lengthOfLastWord("Hello World"));
        System.out.println("\"a\": " + lengthOfLastWord("a"));
        System.out.println("\"Hello World   \": " + lengthOfLastWord("Hello World   "));

        System.out.println("--- reverseString ---");
        char[] one = {'a'};
        reverseString(one);
        System.out.println("['a'] -> " + new String(one));

        char[] arr = {'h', 'e', 'l', 'l', 'o'};
        reverseString(arr);
        System.out.println("hello -> " + new String(arr));

        char[] empty = {};
        reverseString(empty);
        System.out.println("[] -> " + new String(empty));

        reverseString(null);
        System.out.println("null handled without error");
    }
}

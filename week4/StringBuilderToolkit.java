public class StringBuilderToolkit {

    static String reverse(String text) {
        return new StringBuilder(text).reverse().toString();
    }

    static String repeat(String text, int count) {
        if (count <= 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append(text);
        }
        return sb.toString();
    }

    static String joinWords(String[] words, String separator) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            if (i > 0) {
                sb.append(separator);
            }
            sb.append(words[i]);
        }
        return sb.toString();
    }

    static String removeCharacterAt(String text, int index) {
        if (index < 0 || index >= text.length()) {
            return text;
        }
        StringBuilder sb = new StringBuilder(text);
        sb.deleteCharAt(index);
        return sb.toString();
    }

    static String replaceCharacterAt(String text, int index, char replacement) {
        if (index < 0 || index >= text.length()) {
            return text;
        }
        StringBuilder sb = new StringBuilder(text);
        sb.setCharAt(index, replacement);
        return sb.toString();
    }

    static String buildNumberedList(String[] items) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < items.length; i++) {
            sb.append(i + 1).append(". ").append(items[i]);
            if (i < items.length - 1) {
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println("--- reverse ---");
        System.out.println("\"hello\": " + reverse("hello"));
        System.out.println("empty: \"" + reverse("") + "\"");

        System.out.println("--- repeat ---");
        System.out.println("\"ab\", 3: " + repeat("ab", 3));
        System.out.println("\"ab\", 0: \"" + repeat("ab", 0) + "\"");
        System.out.println("\"ab\", -2: \"" + repeat("ab", -2) + "\"");

        System.out.println("--- joinWords ---");
        String[] words = {"apple", "banana", "cherry"};
        System.out.println("words + \", \": " + joinWords(words, ", "));
        System.out.println("empty array: \"" + joinWords(new String[0], ",") + "\"");

        System.out.println("--- removeCharacterAt ---");
        System.out.println("\"hello\", 1: " + removeCharacterAt("hello", 1));
        System.out.println("\"hello\", 99 (invalid): " + removeCharacterAt("hello", 99));

        System.out.println("--- replaceCharacterAt ---");
        System.out.println("\"hello\", 0, 'H': " + replaceCharacterAt("hello", 0, 'H'));
        System.out.println("\"hello\", -1 (invalid): " + replaceCharacterAt("hello", -1, 'x'));

        System.out.println("--- buildNumberedList ---");
        System.out.println(buildNumberedList(new String[]{"Math", "Physics", "CS"}));

        System.out.println("--- immutability of toString() ---");
        StringBuilder builder = new StringBuilder("hello");
        String snapshot = builder.toString();
        builder.append(" world");
        System.out.println("snapshot (String): " + snapshot);
        System.out.println("builder now: " + builder.toString());
    }
}

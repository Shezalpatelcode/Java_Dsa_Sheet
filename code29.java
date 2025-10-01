public class code29 {

    public static int strStr(String haystack, String needle) {
        // Edge case: empty needle
        if (needle.isEmpty()) {
            return 0;
        }

        int n = haystack.length();
        int m = needle.length();

        // Loop through haystack until enough room for needle
        for (int i = 0; i <= n - m; i++) {
            // Check substring match
            if (haystack.substring(i, i + m).equals(needle)) {
                return i; // found at index i
            }
        }

        return -1; // not found
    }

    public static void main(String[] args) {
        String haystack = "hello";
        String needle = "ll";

        int index = strStr(haystack, needle);
        System.out.println("Index of \"" + needle + "\" in \"" + haystack + "\": " + index);
    }
}


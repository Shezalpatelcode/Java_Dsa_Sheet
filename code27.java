public class code27 {

    public static String lcpHorizontal(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        String prefix = strs[0];          // start with the whole first word
        for (int i = 1; i < strs.length; i++) {
            // shrink prefix until it’s a prefix of strs[i]
            while (!strs[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }

    public static void main(String[] args) {
        String[] words = {"flower", "flow", "flight"};
        System.out.println(lcpHorizontal(words));   // "fl"
    }
}



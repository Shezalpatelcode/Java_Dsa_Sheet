import java.util.HashMap;
public class code32 {

    // Returns the longest substring without repeating characters
    public static String longestSubstring(String s) {
        HashMap<Character, Integer> lastSeen = new HashMap<>();
        int left = 0, maxLen = 0, startOfMax = 0;

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            // If we’ve seen c inside the current window, move left pointer
            if (lastSeen.containsKey(c) && lastSeen.get(c) >= left) {
                left = lastSeen.get(c) + 1;
            }
            lastSeen.put(c, right);

            // Update max window when we find a longer one
            if (right - left + 1 > maxLen) {
                maxLen = right - left + 1;
                startOfMax = left;
            }
        }
        return s.substring(startOfMax, startOfMax + maxLen);
    }
    public static void main(String[] args) {
        String input = "abcabcbb";
        String longest = longestSubstring(input);
        System.out.println("Input string                    : " + input);
        System.out.println("Longest substring w/o repetition: " + longest);
        System.out.println("Length                          : " + longest.length());
    }
}


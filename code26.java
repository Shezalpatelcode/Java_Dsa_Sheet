public class code26 {

    public static String countAndSay(int n) {
        if (n <= 0) return "";

        String result = "1";

        for (int i = 1; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            int count = 1;
            for (int j = 1; j < result.length(); j++) {
                if (result.charAt(j) == result.charAt(j - 1)) {
                    count++;
                } else {
                    sb.append(count).append(result.charAt(j - 1));
                    count = 1;
                }
            }
            sb.append(count).append(result.charAt(result.length() - 1));
            result = sb.toString();
        }

        return result;
    }

    public static void main(String[] args) {
        int n = 5; // Change this value to get different terms
        System.out.println("The " + n + "th term in the Count and Say sequence is: " + countAndSay(n));
    }
 }




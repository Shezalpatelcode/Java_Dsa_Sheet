// public class code28 {
//     static int myAtoi(String s) {
      
//         // Handle null or empty string
//         if (s == null || s.isEmpty()) {
//             return 0;
//         }

//         int res = 0, 
//         sign = 1, 
//         i = 0;

//         // Handle negative sign
//         if (s.charAt(0) == '-') {
//             sign = -1;
//             i++; 
//         }

//         // Traverse the string
//         for (; i < s.length(); i++) {
//             char ch = s.charAt(i);

//             // If non-numeric character, return 0
//             if (ch < '0' || ch > '9') {
//                 return 0;
//             }

//             res = res * 10 + (ch - '0');
//         }

//         return res * sign;
//     }
//        public static void main(String[] args) {
//         String s = "-567";
//         System.out.println(myAtoi(s)); 
//     }
// }



// Handling Whitespaces & Invalid Characters
class code28 {

    static int myAtoi(String s) {

        // Handle null or empty string
        if (s == null || s.isEmpty()) {
            return 0;
        }

        // Remove leading spaces
        s = s.trim();
        if (s.isEmpty()) { 
            return 0;
        }

        int res = 0, sign = 1, i = 0;

        // Handle signs
        if (s.charAt(i) == '-' || s.charAt(i) == '+') {
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++; 
        }

        // Traverse the string
        for (; i < s.length(); i++) {
            char ch = s.charAt(i);

            // Stop at first non-digit character
            if (ch < '0' || ch > '9') {
                break;
            }

            res = res * 10 + (ch - '0');
        }

        return res * sign;
    }

    public static void main(String[] args) {
        String s = "   -123xyz";
        System.out.println(myAtoi(s)); 
    }
}
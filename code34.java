public class code34 {
    // Java program to check if two given 
// strings are rotations of each other

    // Method to check if two strings 
    // are rotations of each other
    public static boolean areRotations(String s1, String s2) {
      
        // Check if lengths are equal and s2 is a 
        // substring of s1 concatenated with s1
        return s1.length() == s2.length() && (s1 + s1).contains(s2);
    }

    public static void main(String[] args) {
      
        // Input strings
        String s1 = "ABCD";
        String s2 = "CDAB";

        // Check if s2 is a rotation of s1
        if (areRotations(s1, s2)) {
            System.out.println("\"" + s2 + "\" is a rotation of \"" 
                               + s1 + "\".");
        } else {
            System.out.println("\"" + s2 + "\" is not a rotation of \"" 
                               + s1 + "\".");
        }

        // Additional test cases
        String s3 = "ABAD";
        String s4 = "ADAB";
        if (areRotations(s3, s4)) {
            System.out.println("\"" + s4 + "\" is a rotation of \"" 
                               + s3 + "\".");
        } else {
            System.out.println("\"" + s4 + "\" is not a rotation of \"" 
                               + s3 + "\".");
        }

        String s5 = "ABCD";
        String s6 = "ACBD";
        if (areRotations(s5, s6)) {
            System.out.println("\"" + s6 + "\" is a rotation of \"" 
                               + s5 + "\".");
        } else {
            System.out.println("\"" + s6 + "\" is not a rotation of \"" 
                               + s5 + "\".");
        }
    }
}


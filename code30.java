// Java code for the above approach
import java.util.*;

class code30
{
  
  // Function to check if a palindrome is
// possible or not
static String isPossible(String S)
{
  
    // Stores the length of string
    int n = S.length();

    // Stores the unique characters in
    // the string
    Set<Character> st = new HashSet<Character>();
    
    for (int i = 0; i < n; i++) {
        st.add(S.charAt(i));
    }
    
    // Check if valid palindrome is
    // possible or not
    boolean check = false;

    // Iterating over unique characters
    // of the string
    for (Character ele : st) {

        // Pointers to check the condition
        int low = 0, high = n - 1;
        boolean flag = true;

        // Iterating over the string
        for (int i = 0; i < n; i++) {
            if (S.charAt(low) == S.charAt(high)) {

                // Updating low and high
                low++;
                high--;
            }

            else {
                if (S.charAt(low) == ele) {

                    // Updating low
                    low++;
                }
                else if (S.charAt(high)== ele) {

                    // Updating high
                    high--;
                }
                else {

                    // It is impossible
                    // to make palindrome
                    // by removing
                    // occurrences of char
                    flag = false;
                    break;
                }
            }
        }

        // If palindrome is formed
        // break the loop
        if (flag == true) {
            check = true;
            break;
        }
    }

    if (check)
        return "Yes";
    else
        return "No";
}

// Driver Code
    public static void main (String[] args) {
      String S = "abczdzacb";
    
        System.out.println(isPossible(S));
    }
}

// This code is contributed by Potta Lokesh

class code31 {
    public static int compress(char[] chars) {
        int n = chars.length;
        int index = 0;  // pointer to write result
        int i = 0;      // pointer to read input

        while (i < n) {
            char currentChar = chars[i];
            int count = 0;

            // Count consecutive occurrences
            while (i < n && chars[i] == currentChar) {
                i++;
                count++;
            }

            // Write character
            chars[index++] = currentChar;

            // Write count if > 1
            if (count > 1) {
                for (char c : String.valueOf(count).toCharArray()) {
                    chars[index++] = c;
                }
            }
        }
        return index; // new length
    }

    public static void main(String[] args) {
        char[] chars = {'a','a','b','b','c','c','c'};
        int newLength = compress(chars);

        System.out.print("Compressed array: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(chars[i] + " ");
        }
        System.out.println("\nNew length: " + newLength);
    }
}


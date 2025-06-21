public class RomanToInteger {

    public static int romanToInt(String s) {
        int total = 0;
        int prev = 0;

        // Loop from right to left
        for (int i = s.length() - 1; i >= 0; i--) {
            int curr = value(s.charAt(i));

            // Add or subtract based on value comparison
            total += (curr < prev) ? -curr : curr;

            prev = curr; // Update previous for next comparison
        }

        return total;
    }

    // Use switch instead of if-else for faster lookup
    public static int value(char ch) {
        switch (ch) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0; // For invalid input
        }
    }

    public static void main(String[] args) {
        String roman = "MCMXCIV";  // 1994
        System.out.println("Integer value of " + roman + " is: " + romanToInt(roman));
    }
}

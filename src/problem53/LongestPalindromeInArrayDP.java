package problem53;

public class LongestPalindromeInArrayDP {
    public static void main(String[] args) {
        String[] array = {"babad", "racecar", "abc", "noon", "civic"};
        String longestPalindrome = findLongestPalindromeInArray(array);
        System.out.println("Longest Palindromic Substring in the array: " + longestPalindrome);
    }

    public static String findLongestPalindromeInArray(String[] array) {
        String longestPalindrome = "";
        for (String s : array) {
            String currentLongest = longestPalindromicSubstring(s);
            if (currentLongest.length() > longestPalindrome.length()) {
                longestPalindrome = currentLongest;
            }
        }
        return longestPalindrome;
    }

    public static String longestPalindromicSubstring(String s) {
        int n = s.length();
        if (n < 2) {
            return s;
        }

        boolean[][] dp = new boolean[n][n];
        int maxLength = 1;
        int start = 0;

        for (int i = 0; i < n; i++) {
            dp[i][i] = true;
        }

        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                dp[i][i + 1] = true;
                start = i;
                maxLength = 2;
            }
        }

        for (int length = 3; length <= n; length++) {
            for (int i = 0; i < n - length + 1; i++) {
                int j = i + length - 1;
                if (s.charAt(i) == s.charAt(j) && dp[i + 1][j - 1]) {
                    dp[i][j] = true;
                    start = i;
                    maxLength = length;
                }
            }
        }

        return s.substring(start, start + maxLength);
    }
}


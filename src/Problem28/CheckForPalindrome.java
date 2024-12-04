package Problem28;

public class CheckForPalindrome {
    public static void main(String[] args) {
        System.out.println(checForPalindrome("radar"));
        System.out.println(checForPalindrome("Naman"));
        System.out.println(checForPalindrome("12321"));
        System.out.println(checForPalindrome("12345"));
    }

    private static boolean checForPalindrome(String string) {
        String lowerCaseStr = string.toLowerCase();
        String reversed = new StringBuilder(lowerCaseStr).reverse().toString();
        return lowerCaseStr.equals(reversed);
    }
}



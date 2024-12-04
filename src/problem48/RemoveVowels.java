package problem48;

public class RemoveVowels {
    public static void main(String[] args) {
        String string = "manage";
        String resultantString = removeVowels(string);
        System.out.println("Resultant String is: " + resultantString);
    }

    public static String removeVowels(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') {
                result += c;
            }
        }
        return result;
    }
}


package Problem42;

public class CharacterOccuranceCount {
    public static void main(String[] args) {
        String str = "Hello, World!";
        char charToCount = 'o';
        int count = countOccurrences(str, charToCount);
        System.out.println("The character '" + charToCount + "' occurs " + count + " times in the string.");
    }
    
    public static int countOccurrences(String str, char charToCount) {
        String modifiedStr = str.replace(String.valueOf(charToCount), "");
        return str.length() - modifiedStr.length();
    }
}



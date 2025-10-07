public class ProblemTwo {
    /*
      If string str is empty then return 0, then compare the first letter to all the vowels,
      if one matches then add 1 to the count and recursively iterate back through after removing the first
      letter of the string. if there is no vowel then recursively iterate back through without adding 1 to
      the counter.
   */
    public static int countVowels(String str) {
        return (str.isEmpty() ? 0 : (str.charAt(0) == 'a' || str.charAt(0) == 'e' ||
                str.charAt(0) == 'i' || str.charAt(0) == 'o' || str.charAt(0) == 'u' ||
                str.charAt(0) == 'A' || str.charAt(0) == 'E' || str.charAt(0) == 'I' ||
                str.charAt(0) == 'O' || str.charAt(0) == 'U') ?
                1 + countVowels(str.substring(1)) : countVowels(str.substring(1)));
    }

    public static String reverse(String str) {
        return str.isEmpty() ? "" : reverse(str.substring(1)) + str.charAt(0);
    }

    public static String interweaveChar(String str, char ch) {
        return str.length() <= 1 ? str : str.charAt(0) + String.valueOf(ch) + interweaveChar(str.substring(1), ch);
    }
}

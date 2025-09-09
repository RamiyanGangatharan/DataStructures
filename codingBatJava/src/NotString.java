public class NotString {
    /**
     * Given a string, return a new string where "not " has been added to the front.
     * However, if the string already begins with "not", return the string unchanged.
     * Note: use .equals() to compare 2 strings.
     *
     * @param str a string input
     */
    public static void notString(String str)
    {
        if (str.startsWith("not ")) {
            System.out.println(str);
            return;
        }
        System.out.println("not " + str);
    }
}

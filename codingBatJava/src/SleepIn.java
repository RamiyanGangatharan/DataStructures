public class SleepIn {
    /**
     * Determines if we can sleep in based on weekday and vacation status.
     *
     * @param weekday  true if it is a weekday (Mon–Fri), false otherwise
     * @param vacation true if we are on vacation, false otherwise
     */
    public static void sleepIn(boolean weekday, boolean vacation) {

        boolean sleepIn = false;

        if (!weekday || vacation) {
            sleepIn = true;
            System.out.println("Weekday?: " + weekday);
            System.out.println("Vacation?: " + vacation);
            System.out.println("Can you sleep in?: " + sleepIn);
            return;
        }

        System.out.println("Weekday?: " + weekday);
        System.out.println("Vacation?: " + vacation);
        System.out.println("Can you sleep in?: " + sleepIn);
    }
}

public class Main {

    public static void main(String[] args) {
        System.out.format("Java version: %s%n", getJavaVersion());
//        System.out.format("JUnit version: %s%n", getJUnitVersion());

        String rawNumber = "12345678";
        System.out.format("%s with commas: %s%n", rawNumber, addCommas(rawNumber));

        rawNumber = "345678";
        System.out.format("%s with commas: %s%n", rawNumber, addCommas(rawNumber));
    }

    /** Return a string representation of a number with commas every third digit.
     * @param number - String containing a whole number with no punctuation.
     * @return String containing the same number with commas ever third digit.
     */
    public static String addCommas(String number) {
        if (number.length() <= 2) return number;
        String result = "";
        for (int i = number.length() - 1, count = 0; i >= 0; i--, count++) {
            result = number.charAt(i) + result;
            if (count == 2) {
                result = "," + result;
                count = -1;
            }
        }
        if(result.charAt(0) == ',') result = result.substring(1);
        return result;
    }

    /**
     * get the java version that is running the current program
     *
     * @return string containing the java version running the current program
     */
    private static String getJavaVersion() {
        Runtime.Version runTimeVersion = Runtime.version();
        return String.format("%s.%s.%s.%s", runTimeVersion.feature(), runTimeVersion.interim(), runTimeVersion.update(), runTimeVersion.patch());
    }

    /**
     * Get the Junit version number that is used by the unit tests in this project.
     *
     * @return String containing the JUnit version number.
     */
//    private static String getJUnitVersion() {
//        return org.junit.jupiter.api.Test.class.getPackage().getImplementationVersion();
//    }

}

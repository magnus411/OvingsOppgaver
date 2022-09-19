package ovinger.Oving1;

public class HourToMinToSek {

    /**
     * This function takes an integer as an argument and returns an integer.
     * 
     * @param hour The hour to be converted to seconds.
     * @return The method is returning the number of seconds in the given number of
     *         hours.
     */
    private int hourstoSecond(int hour) {

        return hour * 3600;

    }

    /**
     * This function takes an integer representing a minute value and returns an
     * integer representing
     * the same value in seconds.
     * 
     * @param minute The minute to convert to seconds.
     * @return The number of seconds in the given number of minutes.
     */
    private int minuteToSecond(int minute) {

        return minute * 60;

    }

    /**
     * The function sum takes an array of integers and returns the sum of the
     * integers in the array
     * 
     * @param sum an array of integers
     * @return The sum of the three integers in the array.
     */
    private int sum(int[] sum) {

        int result = sum[0] + sum[1] + sum[2];

        return result;
    }

    // Creating a 2D array with 3 arrays inside as a dataSet
    private static int[][] dataSet = new int[][] { { 1, 2, 3 }, { 3, 60, 30 }, { 5, 56, 12 } };

    /**
     * The function takes in an array of integers, and checks if the integers are
     * within the range of
     * 0-60. If they are, the function returns true. If they are not, the function
     * throws an exception
     * 
     * @param data The array of integers that we want to validate.
     * @return The method returns a boolean value.
     */
    private boolean validate(int[] data) {

        if (60 < data[1]) {
            throw new IllegalArgumentException("Yo, du har feil input på minutter");

        } else if (60 < data[2]) {
            throw new IllegalArgumentException("Yo, du har feil input på Sekunder");

        } else {
            return true;
        }

    }

    /**
     * @param args
     */
    // The main method of the program.
    public static void main(String[] args) {

        // Creating a new instance of the class HourToMinToSek.
        HourToMinToSek convert = new HourToMinToSek();

        // A for loop that iterates through the dataSet array.
        for (int i = 0; i < dataSet.length; i++) {
            // Calling the validate method and passing in the values of the array at the
            // index i.
            convert.validate(new int[] { dataSet[i][0], dataSet[i][1], dataSet[i][2] });

            // Calling the sum method and passing in the values of the array at the index i.
            int c = convert.sum(new int[] { convert.hourstoSecond(dataSet[i][0]), convert.minuteToSecond(dataSet[i][1]),
                    dataSet[i][2] });

            System.out.println(c);
            System.out.println("========================");

        }

        // Sum(hour, minute, second)

    }

}
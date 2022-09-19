package ovinger.Oving1;

//Program for converting inces to cm

class TtoC {

    /**
     * @param centi
     * @return Double
     */
    // Defining the function convert.
    private Double convert(Double centi) {

        // Logic
        // Converting inces to cm

        // Defining that Inches is a dobule with value 2.54
        Double tomme = 2.54;
        // Definding that cm to inces is cm / inces
        Double ctt = centi * tomme;

        // Returning the converted value
        return ctt;
    }

    // Creating a new array with the values 2.3, 1.2, 1.5, 10.2, 59.42.
    private static Double[] dataSet = new Double[] { 2.3, 1.2, 1.5, 10.2, 59.42 };

    /**
     * @param args
     */
    // The main function.
    public static void main(String[] args) {

        // Creating a new instance of the class TtoC.
        TtoC converter = new TtoC();

        // Looping through the array and printing out the converted values.
        for (int i = 0; i < dataSet.length; i++) {
            System.out.println(converter.convert(dataSet[i]));

        }
    }
}
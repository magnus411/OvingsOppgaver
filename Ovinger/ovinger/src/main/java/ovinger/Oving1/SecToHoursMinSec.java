package ovinger.Oving1;

public class SecToHoursMinSec {
    
    private int[] convert(int sec) {
        int s = sec;
        int h = s / 3600;
        int m = (s % 3600) / 60;
        int ns = (s % 60);

        return new int[] {h, m, ns};

    }




    private static int[] dataSet = new int[] {3699, 32941, 2312, 12123, 4345};


    // The main function.
    public static void main(String[] args)  {

    
        
        SecToHoursMinSec converter = new SecToHoursMinSec();


        // Looping through the array and printing out the converted values.
        for (int i = 0; i < dataSet.length; i++) {

            int[] num =  converter.convert(dataSet[i]);


            System.out.println("Seconds " + dataSet[i]);
            System.out.println("Hours " + num[0]);
            System.out.println("Min " + num[1]);
            System.out.println("Sec " + num[2]);
            System.out.println("===============");

            
        }


        
    }




}


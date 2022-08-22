



public class HourToMinToSek {



    private int hourstoSecond(int hour) {

        return hour * 3600;

    }

    private int minuteToSecond(int minute) {

        return minute / 60;

    }



    private int sum(int[] sum) {

        int result = sum[0] + sum[1] + sum[2];

        return result;
    }


    public static void main(String[] args) {
        //call funciton to validate, throw error if it fails

        // liste [[1,2,3], [3t,37min,20sek]]


        int min = 10;
        int timer = 1;
        int sek = 3;

        HourToMinToSek convert = new HourToMinToSek();
        
        int c = convert.sum(new int[] {convert.hourstoSecond(timer),convert.minuteToSecond(min),sek});
        // Sum(hour, minute, second)

        System.out.println(c);

    }



}
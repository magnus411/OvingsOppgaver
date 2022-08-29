
package ovinger.Oving2;

/**
 * It's a class that checks if a year is a leap year or not
 */
public class Skuddor {
    


    /**
     * If x is divisible by 4, return true. If x is divisible by 400, return true. Otherwise, return
     * false
     * 
     * @param x the year to be checked
     * @return a boolean value.
     */
    private Boolean check(int x) {

        if (x % 4 == 0) {
            return true;
        } else {
            if (x % 400 == 0) {
                return true;
            }
            return false;
        }
    }

    public static void main(String[] args) {

        int[] sku = {};

        Skuddor s = new Skuddor();



        // It's a for loop that checks if the year is a leap year or not.
        for (Integer i = 0; i < 2020; i++ ) {

            if (s.check(i) == true) {

                System.out.println(i + " er Skuddor");
    
            } else {
                
            
            }

        }
        System.out.println(sku);
        
        
        

    }


}

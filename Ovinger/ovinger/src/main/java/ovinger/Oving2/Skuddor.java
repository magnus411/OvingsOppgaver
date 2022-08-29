package ovinger.Oving2;

public class Skuddor {
    


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



        for (Integer i = 0; i < 2020; i++ ) {

            if (s.check(i) == true) {

                System.out.println(i + " er Skuddor");
    
            } else {
                
            
            }

        }
        System.out.println(sku);
        
        
        

    }


}

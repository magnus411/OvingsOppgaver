
package ovinger.Oving3;

public class Primtall {
    


    /**
 * It's a class that checks if a number is a prime number
 */
    private boolean prim(int tall) {

        for (int i = 2; i < tall/2; i++) {

            double mod = tall % i;
            if (mod == 0) {
                return false;
            } else {
                
            }
        }
        return true;

    }

    public static void main(String[] args) {

        int tall = 28;
        Primtall primtall = new Primtall();


        for (int i = 0; i < 100; i++) {



            if (primtall.prim(i) == true) {
                System.out.println(i + " er primtall");
            } else {

                
            }

        }

    }


}

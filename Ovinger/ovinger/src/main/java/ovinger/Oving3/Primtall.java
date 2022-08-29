package ovinger.Oving3;

public class Primtall {
    



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

        
        if (primtall.prim(tall) == true) {
            System.out.println(tall + " er primtall");
        } else {
            System.out.println(tall + " er IKKE et primtall");

            
        }



        
        


    }


}

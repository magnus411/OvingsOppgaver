package ovinger.Oving5;

public class Regning {
    
    private double teller;
    private double nevner;
    private double resultat;



    Regning(double teller, double nevner) {
        this.teller = teller;
        this.nevner = nevner;
        this.resultat = 0;
    }



    
    public double getNevner() {
        return nevner;
    }

    public double getTeller() {
        return teller;
        }


    public double sum(double t, double n) {
        //Finner felles Nevner
        double 
        


        return teller + nevner;
    }


    public static void main(String[] args) {

        Regning val = new Regning(2.0,2.0);

        val.sum(2.0, 2.0);
        //System.out.println(val.getNevner());

    }
}

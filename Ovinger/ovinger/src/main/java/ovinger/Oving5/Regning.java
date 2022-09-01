package ovinger.Oving5;

public class Regning {
    
    private double teller;
    private double nevner;
    private String resultat;


    Regning(double teller, double nevner) throws IllegalArgumentException {
        if (nevner < 0) {
            throw new IllegalArgumentException("Invalid teller or nevner");
        }
        this.teller = teller;
        this.nevner = nevner;
        this.resultat = "";
    }

    


    public String getResultat(){
        return resultat;

    }
    
    public double getNevner() {
        return nevner;
    }

    public double getTeller() {
        return teller;
        }




    public void sum(double t, double n) {
        
        
        double newTeller = (teller * n + t * nevner);
        double newNevner =  (nevner * n);


        resultat = (newTeller +  "/"  + newNevner);
    }

    public void sub(double t, double n) {

        double newTeller = (teller * n - t * nevner);
        double newNevner =  (nevner * n);

        resultat = (newTeller +  "/"  + newNevner);


    }


    public void mul(double t, double n) {
        double newTeller = (teller * t / nevner * n);
        double newNevner =  (nevner * n);

        resultat = (newTeller +  "/"  + newNevner);



    }

    public void div(double t, double n) {

        double newTeller = (teller * n);
        double newNevner =  (nevner * t);

        resultat = (newTeller +  "/"  + newNevner);

        
    }





    public static void main(String[] args) {

        Regning val = new Regning(1.0,4.0);
        Regning val2 = new Regning(1.0,4.0);


        val.div(val2.getTeller(), val.getNevner());

        System.out.println(val.getResultat());
    }
}

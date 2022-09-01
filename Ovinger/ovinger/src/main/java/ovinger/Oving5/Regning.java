package ovinger.Oving5;

public class Regning {
    
    private int teller;
    private int nevner;
    private String resultat;


    Regning(int teller, int nevner) throws IllegalArgumentException {
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
    
    public int getNevner() {
        return nevner;
    }

    public int getTeller() {
        return teller;
        }




    public void sum(int t, int n) {
        
        
        int newTeller = (teller * n + t * nevner);
        int newNevner =  (nevner * n);


        resultat = (newTeller +  "/"  + newNevner);
    }

    public void sub(int t, int n) {

        int newTeller = (teller * n - t * nevner);
        int newNevner =  (nevner * n);

        resultat = (newTeller +  "/"  + newNevner);


    }

    public void mul(int t, int n) {
        int newTeller = (teller * t / nevner * n);
        int newNevner =  (nevner * n);

        resultat = (newTeller +  "/"  + newNevner);



    }

    public void div(int t, int n) {

        int newTeller = (teller * n);
        int newNevner =  (nevner * t);

        resultat = (newTeller +  "/"  + newNevner);

        
    }





    public static void main(String[] args) {

        Regning val = new Regning(1,4);
        Regning val2 = new Regning(1,4);


        val.sum(val2.getTeller(), val.getNevner());

        System.out.println(val.getResultat());
    }
}

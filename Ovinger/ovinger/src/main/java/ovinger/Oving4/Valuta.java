package ovinger.Oving4;

public class Valuta {

    private double kurs;

    Valuta(double kurs) {
        this.kurs = kurs;
    }
    
    public double toNOK(double tall) {
        return kurs*tall;
    }

    public double fromNOK(double tall) {
        return tall/kurs;
    }

    
    


}

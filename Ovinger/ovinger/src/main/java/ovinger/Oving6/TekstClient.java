package ovinger.Oving6;

public class TekstClient {

    public static void main(String[] args) {

        Tekst kjør = new Tekst();

        kjør.getAntallTegn();

        System.out.println(kjør.GetTotalTegn());

        
        //System.out.println("Unike Bokstaver")
        System.out.println(kjør.getForsjelligeBokstaver());


        System.out.println(kjør.prosent());

        System.out.println(kjør.oftest());

        System.out.println(kjør.antallGanger("e"));





    }
    
    

}

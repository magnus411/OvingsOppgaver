package ovinger.Oving6;

import java.util.regex.Pattern;

public class Tekst {

    private String tekst = "Mitt navn er Magnus, og jeg liker å progge.";
    private String alf = "abcdefghijklmnopqrstuvwxyzæøå";

    // Pattern spesiellTegn = Pattern.compile("//s");
    // Matcher m = spesiellTegn.matcher(tekst);

    // private String tekst = "Had denoting properly jointure you occasion directly
    // raillery. In said to of poor full be post face snug. Introduced imprudence
    // see say unpleasing devonshire acceptance son. Exeter longer wisdom gay nor
    // design age. Am weather to entered norland no in showing service. Nor repeated
    // speaking shy appetite. Excited it hastily an pasture it observe. Snug hand
    // how dare here too. ";
    private int[] antallTegn = new int[30];

    private int unikeBokstaver = 0;

    public Tekst(String inputTekst) {

        // for(char alfabet = 'a'; alfabet <= 'z'; alfabet++)

        // Går igjennom teksten for hver karakter
        // hvis charakteren finnes i alfabetet, legg den til i AntallTegn i plassen som
        // er indexed til alfabeter
        // Hvis den ikke finnes, alla . og , , legg den til i plass 29
        for (int i = 0; i < tekst.length(); i++) {

            Character chr = tekst.toLowerCase().charAt(i);

            int index = alf.indexOf(chr);

            if (index > 0) {
                antallTegn[index]++;
            } else {
                antallTegn[29]++;
            }

        }

        // Unike bokstaver
        for (int i = 0; i < antallTegn.length; i++) {

            if (antallTegn[i] != 0) {
                unikeBokstaver++;
            }
        }

    }

    public void getAntallTegn() {
        for (int i = 0; i < antallTegn.length; i++) {
            System.out.println("----");
            System.out.println(antallTegn[i]);

        }
        // return antallTegn;

    }

    public int GetTotalTegn() {
        // System.out.println(tekst.length());
        return tekst.length();
    }

    public int getForsjelligeBokstaver() {

        // System.out.println("Unike Bokstaver");
        return unikeBokstaver;

    }

    public double prosent() {

        double x = antallTegn[29];
        double y = tekst.length();

        double z = x / y * 100;

        return z;

    }

    public char oftest() {
        int b = 0;
        for (int i = 0; i < antallTegn.length; i++) {
            int c = antallTegn[i];
            if (antallTegn[i] > b) {
                b = i;
            }
        }
        return tekst.charAt(b);
    }

    public int antallGanger(String e) {

        int index = alf.indexOf(e);
        return antallTegn[index];

    }

    public static void main(String[] args) {

        Tekst tekst = new Tekst();

        tekst.getAntallTegn();
        // Unike Bokstaver
        System.out.println("---Unike Bokstaver---");
        tekst.getForsjelligeBokstaver();

        System.out.println("---Prosent-");
        tekst.prosent();

        System.out.println("--TotaleTegn--");
        tekst.GetTotalTegn();

        // oftest bokstav
        System.out.println("---Oftest bokstav---");
        tekst.oftest();

        System.out.println("Antall Ganger l");
        tekst.antallGanger("e");

    }
}

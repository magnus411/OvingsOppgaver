package ovinger.Oving11;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RealEstateRegister {

    private ArrayList<RealEstate> eiendom;

    public RealEstateRegister() {
        this.eiendom = new ArrayList<RealEstate>();

        RealEstate bolig1 = new RealEstate("Gloappen", 1445, 77, 631, "asd", "1017", "Magnus");
        RealEstate bolig2 = new RealEstate("Glofdfppen", 1445, 77, 631, "asd", "1017", "Magnus");

        eiendom.add(bolig1);
        eiendom.add(bolig2);

    }

    public void addRealEstate(RealEstate eiendom) {
        this.eiendom.add(eiendom);
    }

    public ArrayList<String> printRealEstate() {
        return this.eiendom.stream().map((e) -> e.toString())
                .collect(Collectors.toCollection(ArrayList::new));

    }

    public void createRealEstate(String gateadresse, int postnummer, int bruksareal, int byggeareal, String boligtype,
            String eier, String poststed) {
        RealEstate eiendom = new RealEstate(gateadresse, postnummer, bruksareal, byggeareal, boligtype, poststed, eier);
        this.addRealEstate(eiendom);
    }

}

package ovinger.Oving11;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class RealEstateRegister {

    private ArrayList<RealEstate> eiendom;

    public RealEstateRegister() {
        this.eiendom = new ArrayList<RealEstate>();

        RealEstate bolig1 = new RealEstate("Gloappen", 1445, 77, 631, "asd", 1017, "Magnus");
        RealEstate bolig2 = new RealEstate("Glofdfppen", 1445, 77, 631, "asd", 500, "Magnus");

        eiendom.add(bolig1);
        eiendom.add(bolig2);

    }

    public void addRealEstate(RealEstate eiendom) {
        this.eiendom.add(eiendom);
    }

    public ArrayList<String> printRealEstate() {
        return this.eiendom.stream().map((e) -> e.toString()).collect(Collectors.toCollection(ArrayList::new));
    }

    public void createRealEstate(String municipalityName, int municipalityNumber, int lotNumber, int sectionNumber,
            String name,
            int area, String owner) {
        RealEstate eiendomEn = new RealEstate(municipalityName, municipalityNumber, lotNumber, sectionNumber, name,
                area, owner);
        this.addRealEstate(eiendomEn);
    }

    public void deleteRealEstate(String gateadresse, int postnummer) {
        this.eiendom.removeIf(
                (RealEstate e) -> e.getMunicipalityName().equals(gateadresse)
                        && e.getMunicipalityNumber() == postnummer);
    }

    public int getNumberOfRealEstate() {
        return this.eiendom.size();

    }

    public ArrayList<String> getUniqueIDforAll() {
        return this.eiendom.stream().map((e) -> e.getUniqueID()).collect(Collectors.toCollection(ArrayList::new));

    }

    public ArrayList<String> getRealEstateMunicipalityNr(int number) {
        return (this.eiendom.stream().filter((e) -> e.getMunicipalityNumber() == number).map((e) -> e.toString())
                .collect(Collectors.toCollection(ArrayList::new)));

    }

    public ArrayList<String> getRealEstateByMLS(int municipalityNumber, int lotNumber, int sectionNumber) {
        return this.eiendom.stream().filter((e) -> e.getMunicipalityNumber() == municipalityNumber)
                .filter((e) -> e.getLotNumber() == lotNumber).filter((e) -> e.getSectionNumber() == sectionNumber)
                .map((e) -> e.toString())
                .collect(Collectors.toCollection(ArrayList::new));

    }

    public double getRealEstateAvrArea() {
        return this.eiendom.stream().mapToInt(RealEstate::getArea).average().getAsDouble();

    }

}
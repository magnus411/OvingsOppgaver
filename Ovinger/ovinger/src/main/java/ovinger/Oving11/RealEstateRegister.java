package ovinger.Oving11;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

/**
 * A class to create a real estate register
 * 
 * @author Magnus Gjerstad
 * @version 1.0
 * 
 */
public class RealEstateRegister {

    private ArrayList<RealEstate> eiendom;

    /*
     * A constructor for the real estate register
     * 
     * This constructor creates an arraylist of real estates, and also creates and
     * adds two real estates to the arraylist
     * 
     * @param eiendom An arraylist of real estates
     */
    public RealEstateRegister() {

        this.eiendom = new ArrayList<RealEstate>();

        RealEstate bolig1 = new RealEstate("Gloappen", 1445, 77, 631, "asd", 1017, "Magnus");
        RealEstate bolig2 = new RealEstate("Glofdfppen", 1445, 77, 631, "asd", 500, "Magnus");

        eiendom.add(bolig1);
        eiendom.add(bolig2);

    }

    /*
     * A method to add a real estate to the arraylist
     * 
     * @param eiendom A real estate
     */
    public void addRealEstate(RealEstate eiendom) {
        this.eiendom.add(eiendom);
    }

    /*
     * A method to get all the real estates in the arraylist as a string
     */
    public ArrayList<String> printRealEstate() {
        return this.eiendom.stream()
                .map((e) -> e.toString())
                .collect(Collectors.toCollection(ArrayList::new));
    }

    /*
     * A method to create a real estate and add it to the arraylist
     */
    public void createRealEstate(String municipalityName, int municipalityNumber, int lotNumber, int sectionNumber,
            String name,
            int area, String owner) {

        RealEstate eiendomEn = new RealEstate(municipalityName, municipalityNumber, lotNumber, sectionNumber, name,
                area, owner);
        this.addRealEstate(eiendomEn);
    }

    /*
     * A method to delete a real estate from the arraylist
     * 
     * @param gateadress Municipality Name
     * 
     * @param postnummer Municipality Number
     */
    public void deleteRealEstate(String gateadresse, int postnummer) {
        this.eiendom.removeIf(
                (RealEstate e) -> e.getMunicipalityName().equals(gateadresse)
                        && e.getMunicipalityNumber() == postnummer);
    }

    /*
     * A method to get the number of real estates
     */
    public int getNumberOfRealEstate() {
        return this.eiendom.size();

    }

    public ArrayList<String> getRealEstateByMunicipality(String municipalityName, int municipalityNumber) {
        return this.eiendom.stream()
                .filter((e) -> e.getMunicipalityName().equals(municipalityName))
                .filter((e) -> e.getMunicipalityNumber() == municipalityNumber)
                .map((e) -> e.toString())
                .collect(Collectors.toCollection(ArrayList::new));
    }

    /*
     * A method to get all the Unique IDs from all of the registerd real estates
     */
    public ArrayList<String> getUniqueIDforAll() {
        return this.eiendom.stream()
                .map((e) -> e.getUniqueID())
                .collect(Collectors.toCollection(ArrayList::new));

    }

    /*
     * A Method to get municipalitys by the municipality number
     * 
     * @param number municipality number
     */
    public ArrayList<String> getRealEstateMunicipalityNr(int number) {
        return (this.eiendom.stream()
                .filter((e) -> e.getMunicipalityNumber() == number)
                .map((e) -> e.toString())
                .collect(Collectors.toCollection(ArrayList::new)));

    }

    /*
     * A method to search for real estates by the municipality numer, lot numer and
     * section number
     * 
     * @param municipalityNumber municipality number
     * 
     * @param lotNumber lot number
     * 
     * @param sectionNumber section number
     */
    public ArrayList<String> getRealEstateByMLS(int municipalityNumber, int lotNumber, int sectionNumber) {
        return this.eiendom.stream()
                .filter((e) -> e.getMunicipalityNumber() == municipalityNumber)
                .filter((e) -> e.getLotNumber() == lotNumber)
                .filter((e) -> e.getSectionNumber() == sectionNumber)
                .map((e) -> e.toString())
                .collect(Collectors.toCollection(ArrayList::new));

    }

    /*
     * A method to get the average area of all the real estates in the arraylist
     * 
     * @return The average area of all the real estates in the arraylist
     */
    public double getRealEstateAvrArea() {
        return this.eiendom.stream()
                .mapToInt(RealEstate::getArea)
                .average()
                .getAsDouble();

    }

}
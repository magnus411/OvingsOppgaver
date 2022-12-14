
package ovinger.Oving11;

/**
 * A class to create a real estate
 * 
 * @author Magnus Gjerstad
 * @version 1.0
 * 
 */
public class RealEstate {

    private int municipalityNumber;
    private String municipalityName;
    private int lotNumber;
    private int sectionNumber;
    private String name;
    private int area;
    private String owner;

    /*
     * A constructor for the real estate
     * 
     * @param municipalityName The name of the municipality
     * 
     * @param municipalityNumber The number of the municipality
     * 
     * @param lotNumber The lot number
     * 
     * @param sectionNumber The section number
     * 
     * @param name The name of the real estate
     * 
     * @param area The area of the real estate
     */
    public RealEstate(String municipalityName, int municipalityNumber, int lotNumber, int sectionNumber, String name,
            int area, String owner) {
        this.municipalityName = municipalityName;

        if (this.municipalityNumber >= 101 && this.municipalityNumber <= 5054) {
            this.municipalityNumber = municipalityNumber;
        } else {
            throw new IllegalArgumentException("Municipality number must be between 101 and 5054");
        }

        this.lotNumber = lotNumber;
        this.sectionNumber = sectionNumber;
        this.name = name;
        this.area = area;
        this.owner = owner;

    }

    /*
     * A getter for the municipality number
     */
    public int getMunicipalityNumber() {
        return this.municipalityNumber;
    }

    /*
     * A setter for the municipality number
     */
    public void setMunicipalityNumber(int municipalityNumber) {
        this.municipalityNumber = municipalityNumber;
    }

    /*
     * A getter for the municipality name
     */
    public String getMunicipalityName() {
        return this.municipalityName;
    }

    /*
     * A setter for the municipality name
     */
    public void setMunicipalityName(String municipalityName) {
        this.municipalityName = municipalityName;
    }

    /*
     * A getter for the lot number
     */
    public int getLotNumber() {
        return this.lotNumber;
    }

    /*
     * A setter for the lot number
     */
    public void setLotNumber(int lotNumber) {
        this.lotNumber = lotNumber;
    }

    /*
     * A getter for the section number
     */
    public int getSectionNumber() {
        return this.sectionNumber;
    }

    /*
     * A setter for the section number
     */
    public void setSectionNumber(int sectionNumber) {
        this.sectionNumber = sectionNumber;
    }

    /*
     * A getter for the name
     */
    public String getName() {
        return this.name;
    }

    /*
     * A setter for the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /*
     * A getter for the area
     */
    public int getArea() {
        return this.area;
    }

    /*
     * A setter for the area
     */
    public void setArea(String area) {
        this.area = area;
    }

    /*
     * A getter for the owner
     */
    public String getOwner() {
        return this.owner;
    }

    /*
     * A setter for the owner
     */
    public void setOwner(String owner) {
        this.owner = owner;
    }

    /*
     * A method to get the unique ID for the real estate
     */
    public String getUniqueID() {
        return (this.municipalityNumber + "-" + this.lotNumber + "/" + this.sectionNumber);
    }

    /*
     * A method to get the real estate as a string
     */
    public String toString() {
        return "Eiendom{" +
                "municipalityNumber=" + municipalityNumber +
                ", municipalityName='" + municipalityName + '\'' +
                ", lotNumber=" + lotNumber +
                ", sectionNumber=" + sectionNumber +
                ", name='" + name + '\'' +
                ", area='" + area + '\'' +
                ", owner='" + owner + '\'' +
                '}';
    }

}

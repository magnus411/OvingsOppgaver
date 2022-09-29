package ovinger.Oving11;

public class RealEstate {

    int municipalityNumber;
    String municipalityName;
    int lotNumber;
    int sectionNumber;
    String name;
    String area;
    String owner;

    public RealEstate(String municipalityName, int municipalityNumber, int lotNumber, int sectionNumber, String name,
            String area, String owner) {
        this.municipalityName = municipalityName;
        this.municipalityNumber = municipalityNumber;

        this.lotNumber = lotNumber;
        this.sectionNumber = sectionNumber;
        this.name = name;
        this.area = area;
        this.owner = owner;

    }

    public int getMunicipalityNumber() {
        return municipalityNumber;
    }

    public void setMunicipalityNumber(int municipalityNumber) {
        this.municipalityNumber = municipalityNumber;
    }

    public String getMunicipalityName() {
        return municipalityName;
    }

    public void setMunicipalityName(String municipalityName) {
        this.municipalityName = municipalityName;
    }

    public int getLotNumber() {
        return lotNumber;
    }

    public void setLotNumber(int lotNumber) {
        this.lotNumber = lotNumber;
    }

    public int getSectionNumber() {
        return sectionNumber;
    }

    public void setSectionNumber(int sectionNumber) {
        this.sectionNumber = sectionNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

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

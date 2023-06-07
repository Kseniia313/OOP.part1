public class Kogtevran extends Hogwarts{
    private int qualityMind;
    private int qualityWisdom;
    private int qualityWit;
    private int qualityCreation;

    public Kogtevran(String name, int qualityColdovat, int qualityTransgressirovat, int qualityMind, int qualityWisdom, int qualityWit, int qualityCreation) {
        super(name, qualityColdovat, qualityTransgressirovat);
        this.qualityMind = qualityMind;
        this.qualityWisdom = qualityWisdom;
        this.qualityWit = qualityWit;
        this.qualityCreation = qualityCreation;
    }

    public int getQualityMind() {
        return qualityMind;
    }

    public void setQualityMind(int qualityMind) {
        this.qualityMind = qualityMind;
    }

    public int getQualityWisdom() {
        return qualityWisdom;
    }

    public void setQualityWisdom(int qualityWisdom) {
        this.qualityWisdom = qualityWisdom;
    }

    public int getQualityWit() {
        return qualityWit;
    }

    public void setQualityWit(int qualityWit) {
        this.qualityWit = qualityWit;
    }

    public int getQualityCreation() {
        return qualityCreation;
    }

    public void setQualityCreation(int qualityCreation) {
        this.qualityCreation = qualityCreation;

    }
}

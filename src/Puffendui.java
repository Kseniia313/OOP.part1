public class Puffendui extends Hogwarts{
    private int qualityTrudolybie;
    private int qualityLoyalty;
    private int qualityHonest;

    public Puffendui(String name, int qualityColdovat, int qualityTransgressirovat, int qualityTrudolybie, int qualityLoyalty, int qualityHonest) {
        super(name, qualityColdovat, qualityTransgressirovat);
        this.qualityTrudolybie = qualityTrudolybie;
        this.qualityLoyalty = qualityLoyalty;
        this.qualityHonest = qualityHonest;
    }

    public int getQualityTrudolybie() {
        return qualityTrudolybie;
    }

    public void setQualityTrudolybie(int qualityTrudolybie) {
        this.qualityTrudolybie = qualityTrudolybie;
    }

    public int getQualityLoyalty() {
        return qualityLoyalty;
    }

    public void setQualityLoyalty(int qualityLoyalty) {
        this.qualityLoyalty = qualityLoyalty;
    }

    public int getQualityHonest() {
        return qualityHonest;
    }

    public void setQualityHonest(int qualityHonest) {
        this.qualityHonest = qualityHonest;
    }
}


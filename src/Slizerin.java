
public class Slizerin extends Hogwarts {
    private int qualityTrick;
    private int qualityResoluteness;
    private int qualityAmbition;
    private int qualityResourceFulness;
    private int qualityLustForPower;

    public Slizerin(String name, int qualityColdovat, int qualityTransgressirovat, int qualityTrick, int qualityResoluteness, int qualityAmbition, int qualityResourceFulness, int qualityLustForPower) {
        super(name, qualityColdovat, qualityTransgressirovat);
        this.qualityTrick = qualityTrick;
        this.qualityResoluteness = qualityResoluteness;
        this.qualityAmbition = qualityAmbition;
        this.qualityResourceFulness = qualityResourceFulness;
        this.qualityLustForPower = qualityLustForPower;
    }

    public int getQualityTrick() {
        return qualityTrick;
    }

    public void setQualityTrick(int qualityTrick) {
        this.qualityTrick = qualityTrick;
    }

    public int getQualityResoluteness() {
        return qualityResoluteness;
    }

    public void setQualityResoluteness(int qualityResoluteness) {
        this.qualityResoluteness = qualityResoluteness;
    }

    public int getQualityAmbition() {
        return qualityAmbition;
    }

    public void setQualityAmbition(int qualityAmbition) {
        this.qualityAmbition = qualityAmbition;
    }

    public int getQualityResourceFulness() {
        return qualityResourceFulness;
    }

    public void setQualityResourceFulness(int qualityResourceFulness) {
        this.qualityResourceFulness = qualityResourceFulness;
    }

    public int getQualityLustForPower() {
        return qualityLustForPower;
    }

    public void setQualityLustForPower(int qualityLustForPower) {
        this.qualityLustForPower = qualityLustForPower;
    }


}


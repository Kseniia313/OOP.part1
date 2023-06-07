public class Hogwarts {
    private String name;
    private int qualityColdovat;
    private int qualityTransgressirovat;

    public Hogwarts(String name, int qualityColdovat, int qualityTransgressirovat) {
        this.name = name;
        this.qualityColdovat = qualityColdovat;
        this.qualityTransgressirovat = qualityTransgressirovat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getColdovat() {
        return qualityColdovat;
    }

    public void setColdovat(int coldovat) {
        this.qualityColdovat = coldovat;
    }

    public int getTransgressirovat() {
        return qualityTransgressirovat;
    }

    public void setTransgressirovat(int transgressirovat) {
        this.qualityTransgressirovat = transgressirovat;
    }


}



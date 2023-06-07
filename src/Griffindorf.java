public class Griffindorf extends Hogwarts {

    private int qualityNobility;
    private int qualityHonor;
    private int qualityBravery;



    public Griffindorf(String name, int qualityColdovat, int qualityTransgressirovat, int qualityNobility, int qualityHonor, int qualityBravery) {
        super(name, qualityColdovat, qualityTransgressirovat);
        this.qualityNobility = qualityNobility;
        this.qualityHonor = qualityHonor;
        this.qualityBravery = qualityBravery;
    }

    public int getNobility() {
        return qualityNobility;
    }

    public void setNobility(int nobility) {
        this.qualityNobility = nobility;
    }

    public int getHonor() {
        return qualityHonor;
    }

    public void setHonor(int honor) {
        this.qualityHonor = honor;
    }

    public int getBravery() {
        return qualityBravery;
    }

    public void setBravery(int bravery) {
        this.qualityBravery = bravery;

    }


    }



        

            


    




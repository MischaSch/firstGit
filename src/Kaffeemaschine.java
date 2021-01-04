public class Kaffeemaschine {
    // Attribute
    private double waterLevel;
    private double beansLevel;
    private boolean isEmpty;
    private Mug mug;


    // Konstruktor
    Kaffeemaschine() {
        assert (this.waterLevel == 0);
        assert (this.beansLevel == 0);
    }

    // Getter
    public double getWaterLevel() {
        return this.waterLevel;
    }

    public double getBeanLevel() {
        return this.beansLevel;
    }

    // Setter
    void fillWater(double ml) {
        assert(ml > 0 && ml <= 1500);
        this.waterLevel += ml;
    }

    void fillBeans(double grams) {
        assert (grams > 0 && grams <= 1000);
        this.beansLevel += grams;
    }


    boolean isEmpty() {
        this.isEmpty = (this.waterLevel < 240) || (this.beansLevel < 30);
        return this.isEmpty;
    }

    public Mug setMug(double fillLevel){
        Mug m = new Mug(fillLevel);
        return m;
    }
    public String getMugType(Mug m){
        return m.type;
    }
    public double getMugWidth(Mug m){
        return m.getFillLevel();
    }

    public void getCoffee() {
        isEmpty();
        while (!this.isEmpty) {
            this.waterLevel -= 240;
            this.beansLevel -= 30;
            isEmpty();
            System.out.format("Wasserstand: %.2fml \nBohnenstand: %.2fg\n", this.waterLevel, this.beansLevel);
            if (isEmpty()){
                System.out.println("Bitte Wasser oder Bohnen füllen.");
            }
        }
    }
}



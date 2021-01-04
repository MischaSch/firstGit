public class Mug {
    private double fillLevel;
    public String type;

    Mug(double fillLevel){
        this.fillLevel = fillLevel;
        this.type = fillWidth(fillLevel);
    }

    private String fillWidth(double amount) {
        this.fillLevel = amount;
        // ENUM Betrachtung möglich
        if (this.fillLevel <= 100) {
            this.type = "small";
        } else { this.type = (this.fillLevel > 100 && this.fillLevel <= 200) ? "medium" : "large";}
        return this.type;
    }

    public double getFillLevel() {
        return fillLevel;
    }
}




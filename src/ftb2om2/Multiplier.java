package ftb2om2;

public class Multiplier {
    private Double ms;
    private Double multiplier;

    public Multiplier() {
    }

    public Multiplier(Double ms, Double multiplier) {
        this.ms = ms;
        this.multiplier = multiplier;
    }

    public Double getMs() {
        return ms;
    }

    public void setMs(Double ms) {
        this.ms = ms;
    }

    public Double getMultiplier() {
        return multiplier;
    }

    public void setMultiplier(Double multiplier) {
        this.multiplier = multiplier;
    }   
}

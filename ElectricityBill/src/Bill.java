public class Bill {

    private double total;
    private double belowOneHundredIncrement;
    private double overOneHundredIncrement;


    public Bill() {
        total = 0;
        belowOneHundredIncrement = 26.7;
        overOneHundredIncrement = 15.6;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getBelowOneHundredIncrement() {
        return belowOneHundredIncrement;
    }

    public void setBelowOneHundredIncrement(double belowOneHundredIncrement) {
        this.belowOneHundredIncrement = belowOneHundredIncrement;
    }

    public double getOverOneHundredIncrement() {
        return overOneHundredIncrement;
    }

    public void setOverOneHundredIncrement(double overOneHundredIncrement) {
        this.overOneHundredIncrement = overOneHundredIncrement;
    }

    public void incrementOverOneHundred() {
        this.total = total + overOneHundredIncrement;
    }

    public void incrementBelowOneHundred() {
        this.total = total + belowOneHundredIncrement;
    }
}

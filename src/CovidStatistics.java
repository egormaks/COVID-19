public class CovidStatistics {
    private int activeCases;
    private int confirmed;
    private int deceased;
    private int recovered;

    public CovidStatistics(int activeCases, int confirmed, int deceased, int recovered) {
        this.activeCases = activeCases;
        this.confirmed = confirmed;
        this.deceased = deceased;
        this.recovered = recovered;
    }

    public int getActiveCases() {
        return activeCases;
    }

    public int getConfirmed() {
        return confirmed;
    }

    public int getDeceased() {
        return deceased;
    }

    public int getRecovered() {
        return recovered;
    }

}
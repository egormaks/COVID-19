public class CountyData {
    private String countyName;
    private CovidStatistics statistics;
    private Coordinates countyCoords;

    public CountyData(String countyName, CovidStatistics statistics, Coordinates countyCoords) {
        this.countyName = countyName;
        this.countyCoords = countyCoords;
        this.statistics = statistics;
    }

    public String getCountyName() {
        return countyName;
    }

    public CovidStatistics getStatistics() {
        return statistics;
    }

    public Coordinates getCountyCoords() {
        return countyCoords;
    }

}
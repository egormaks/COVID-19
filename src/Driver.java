import java.io.File;
import java.io.IOException;
import java.util.*;

public class Driver {
    private static final String END_POINT = "covid19-em.cft3apfagbni.us-east-1.rds.amazonaws.com";
    private static final int PORT = 1433;
    private static Timestamp currentTimestamp = new Timestamp(5, 4, 2020);
    private static Map<String, List<CountyData>> covidData;

    public static void main(String[] args)  {
        try {

            covidData = new HashMap<>();
            File file = new File("csse_covid_19_data/csse_covid_19_daily_reports/" +
                    currentTimestamp.toString() + ".csv");
            Scanner scan = new Scanner(file);
            if (scan.nextLine() == null) {
                throw new IOException();
            }
            while (scan.hasNext()) {
                String[] data = scan.nextLine().split(",");
                if (data[3].equals("US")) {
                    String county = data[1];
                    String state = data[2];
                    float lat;
                    float lon;
                    if (data[5].isEmpty() || data[6].isEmpty()) {
                        lat = -1;
                        lon = -1;
                    } else {
                        lat = Float.valueOf(data[5]);
                        lon = Float.valueOf(data[6]);
                    }
                    int confirmed = Integer.valueOf(data[7]);
                    int deaths = Integer.valueOf(data[8]);
                    int recovered = Integer.valueOf(data[9]);
                    int active = Integer.valueOf(data[10]);
                    CovidStatistics covStats = new CovidStatistics(active, confirmed, deaths, recovered);
                    CountyData cdata = new CountyData(county, covStats, new Coordinates(lat, lon));
                    if (!covidData.containsKey(state)) {
                        covidData.put(state, new ArrayList<>());
                    }
                    covidData.get(state).add(cdata);
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }


}

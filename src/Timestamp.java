public class Timestamp {
    private int month;
    private int day;
    private int year;

    public Timestamp(int month, int day, int year) {
        if (month < 0 || month > 12) {
            throw new IllegalArgumentException();
        }
        if (day < 0 || day > 31) {
            throw new IllegalArgumentException();
        }
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public void increment() {
        if (day + 1 > 31) {
            day = 1;
            if (month + 1 > 12) {
                month = 1;
                year++;
            } else {
                month++;
            }
        } else day++;
    }

    public void increment(int amount, String type) {
        // TODO
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (month < 10) {
            sb.append("0");
            sb.append(month);
            sb.append("-");
        } else {
            sb.append(month);
            sb.append("-");
        }
        if (day < 10) {
            sb.append("0");
            sb.append(day);
            sb.append("-");
        } else {
            sb.append(day);
            sb.append("-");
        }
        sb.append(year);
        return sb.toString();
    }
}



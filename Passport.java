package now.homework.hw1;

public class Passport {
    private String series;
    private int number;
    private String issuedBy;

    public Passport() {
    }

    public Passport(String series, int number, String issuedBy) {
        this.series = series;
        this.number = number;
        this.issuedBy = issuedBy;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getIssuedBy() {
        return issuedBy;
    }

    public void setIssuedBy(String issuedBy) {
        this.issuedBy = issuedBy;
    }

    @Override
    public String toString() {
        return "Passport{" +
                "series='" + series + '\'' +
                ", number=" + number +
                ", issuedBy='" + issuedBy + '\'' +
                '}';
    }
}

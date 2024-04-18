public class Hooman {
    private String AK;
    private String nationality;
    private String citizenship;

    public Hooman() {
    }

    public Hooman(String AK, String nationality, String citizenship) {
        this.AK = AK;
        this.nationality = nationality;
        this.citizenship = citizenship;
    }

    public String getAK() {
        return AK;
    }

    public void setAK(String AK) {
        this.AK = AK;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getCitizenship() {
        return citizenship;
    }

    public void setCitizenship(String citizenship) {
        this.citizenship = citizenship;
    }

    @Override
    public String toString() {
        return "Hooman{" +
                "AK='" + AK + '\'' +
                ", nationality='" + nationality + '\'' +
                ", citizenship='" + citizenship + '\'' +
                '}';
    }
}

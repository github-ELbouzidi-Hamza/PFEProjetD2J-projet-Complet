package ma.pfe.entities;

import javax.persistence.Embeddable;

@Embeddable
public class Adress {

    private String rue;

    private String avanue;

    private String number;

    public String getRue() {
        return rue;
    }

    public void setRue(String rue) {
        this.rue = rue;
    }

    public String getAvanue() {
        return avanue;
    }

    public void setAvanue(String avanue) {
        this.avanue = avanue;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}

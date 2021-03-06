/**
 *
 * @author jgillet
 * */
public class Assignatura {
    public long id = 0;
    private int hores = 0;
    public int credits = 0;
    private int plaza = 0;
    private String nom = "";
    /**
     * Method to get the id of the subject
     * @return id
     * */
    public long getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public int getHores() {
        return hores;
    }

    public int getCredits() {
        return credits;
    }

    public int getPlaza() {
        return plaza;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    /**
     * @deprecated since we don't set the hours now, and they are automatically set, this method is deprecated
     * */
    public void setHores(int hores) {
        this.hores = hores;
    }
    public void setCredits(int credits) {
        this.credits = credits;
    }
    public void setPlaza(int plaza) {
        this.plaza = plaza;
    }
    public Assignatura(long id, String nom, int hores, int credits, int plaza) {
        this.id = id;
        this.nom = nom;
        this.hores = hores;
        this.credits = credits;
        this.plaza = plaza;
    }

}

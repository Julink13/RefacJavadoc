/**
 * @author jgillet
 * */
public class Estudiant {
    public static String getNom() {
        return nom;
    }
/**
 * Creating the class Estudiant
 * */
    private static String nom = "";
    private static String cognoms = "";
    /** @param nom*/
    public static void setNom(String nom) {
        Estudiant.nom = nom;
    }
    public static void setCognoms(String cognoms) {
        Estudiant.cognoms = cognoms;
    }
    public static void setDni(String dni) {
        Estudiant.dni = dni;
    }

    public static void setCurs(int curs) {
        Estudiant.curs = curs;
    }

    private static String dni = "";
    private static int curs = 0;
}

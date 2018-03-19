/*
    Projet Ingénierie Logicielle M1 MTII
*/


// Class Billet
public class Billet {
    
    private int id;
    private String nom;
    private String prenom;
    private String email;
    private String concert;
    private String placeAssise;
    private int numeroPlace;
    private float prix;

    // Constructeur
    public Billet(int id, String nom, String prenom, String email, String concert, String placeAssise, int numeroPlace, float prix) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.concert = concert;
        this.placeAssise = placeAssise;
        this.numeroPlace = numeroPlace;
        this.prix = prix;
    }
    
    // getteur id
    public int getId() {
        return id;
    }

    // Setteur id
    public void setId(int id) {
        this.id = id;
    }

    // Getteur nom
    public String getNom() {
        return nom;
    }

    // Setteur nom
    public void setNom(String nom) {
        this.nom = nom;
    }

    // Getteur prenom
    public String getPrenom() {
        return prenom;
    }

    // Setteur prenom
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    // Getteur email
    public String getEmail() {
        return email;
    }
    
    // Setteur email
    public void setEmail(String email) {
        this.email = email;
    }

    // Getteur concert
    public String getConcert() {
        return concert;
    }

    // Setteur concert
    public void setConcert(String concert) {
        this.concert = concert;
    }

    // Getteur placeAssise
    public String getPlaceAssise() {
        return placeAssise;
    }

    // Setteur placeAssise
    public void setPlaceAssise(String placeAssise) {
        this.placeAssise = placeAssise;
    }

    // Getteur numeroPlace
    public int getNumeroPlace() {
        return numeroPlace;
    }

    // Setteur numeroPlace
    public void setNumeroPlace(int numeroPlace) {
        this.numeroPlace = numeroPlace;
    }

    // Getteur prix
    public float getPrix() {
        return prix;
    }

    // Setteur prix
    public void setPrix(float prix) {
        this.prix = prix;
    }
}

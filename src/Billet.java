public class Billet {
    
    private int id;
    private String nom;
    private String prenom;
    private String email;
    private String concert;
    private String placeAssise;
    private int numeroPlace;
    private float prix;

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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getConcert() {
        return concert;
    }

    public void setConcert(String concert) {
        this.concert = concert;
    }

    public String getPlaceAssise() {
        return placeAssise;
    }

    public void setPlaceAssise(String placeAssise) {
        this.placeAssise = placeAssise;
    }

    public int getNumeroPlace() {
        return numeroPlace;
    }

    public void setNumeroPlace(int numeroPlace) {
        this.numeroPlace = numeroPlace;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }
}

import java.time.LocalDate;

public class Member {
    private String nom;
    private LocalDate dateDeNaissance;
    private int idAdherent;

    // Constructeur
    public Member(String nom, LocalDate dateDeNaissance, int idAdherent) {
        this.nom = nom;
        this.dateDeNaissance = dateDeNaissance;
        this.idAdherent = idAdherent;
    }

    @Override
    public String toString() {
        return "Member{" +
                "nom='" + nom + '\'' +
                ", dateDeNaissance=" + dateDeNaissance +
                ", idAdherent=" + idAdherent +
                '}';
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public LocalDate getDateDeNaissance() {
        return dateDeNaissance;
    }

    public void setDateDeNaissance(LocalDate dateDeNaissance) {
        this.dateDeNaissance = dateDeNaissance;
    }

    public int getIdAdherent() {
        return idAdherent;
    }

    public void setIdAdherent(int idAdherent) {
        this.idAdherent = idAdherent;
    }
}

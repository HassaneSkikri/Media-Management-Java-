import java.time.LocalDate;

public class Emprunt{
    private MediaItem media;
    private Member adherent;
    private LocalDate dateEmprunt;
    private LocalDate dateRetour;

    public Emprunt(MediaItem media, Member adherent, LocalDate dateEmprunt) {
        this.media = media;
        this.adherent = adherent;
        this.dateEmprunt = dateEmprunt;
        this.dateRetour = null;
    }

    @Override
    public String toString() {
        return "Emprunt{" +
                "media=" + media +
                ", adherent=" + adherent +
                ", dateEmprunt=" + dateEmprunt +
                ", dateRetour=" + (dateRetour == null ? "Non retourné" : dateRetour) +
                '}';
    }

    public MediaItem getmedia() {
        return media;
    }

    public void setmedia(MediaItem media) {
        this.media = media;
    }

    public Member getAdherent() {
        return adherent;
    }

    public void setAdherent(Member adherent) {
        this.adherent = adherent;
    }

    public LocalDate getDateEmprunt() {
        return dateEmprunt;
    }

    public void setDateEmprunt(LocalDate dateEmprunt) {
        this.dateEmprunt = dateEmprunt;
    }

    public LocalDate getDateRetour() {
        return dateRetour;
    }

    public void setDateRetour(LocalDate dateRetour) {
        if (dateRetour.isAfter(dateEmprunt)) {
            this.dateRetour = dateRetour;
        } else {
            System.out.println("La date de retour doit être après la date d'emprunt.");
        }
    }
}

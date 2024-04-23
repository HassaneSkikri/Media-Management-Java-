import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Mediatheque {
    private List<Member> Members = new ArrayList<>();
    private List<MediaItem> media = new ArrayList<>();
    private List<Emprunt> emprunts = new ArrayList<>();

    // ------------------------------- Liste des Adhérents --------------------------------

    public void ajouterMember(Member Member) {
        if (!Members.contains(Member)) {
            Members.add(Member);
        } else {
            System.out.println("L'adhérent existe déjà.");
        }
    }

    public void retirerMember(Member Member) {
        Members.remove(Member);
    }

    public void afficherTousLesMembers() {
        for (Member Member : Members) {
            System.out.println(Member);
        }
    }

    // ------------------------------- Liste des Médias -----------------------------------

    public void ajouterMedia(MediaItem mediaItem) {
        media.add(mediaItem);
    }

    public void affichermediaDisponibles() {
        for (MediaItem media : media) {
            if (media.getCopiesDisponibles() > 0) {
                System.out.println(media);
            }
        }
    }

    public void affichermediaIndisponibles() {
        for (MediaItem media : media) {
            if (media.getCopiesDisponibles() == 0) {
                System.out.println(media);
            }
        }
    }

    // ------------------------------- Enregistrement des Emprunts ------------------------

    public void enregistrerEmprunt(Emprunt emprunt) {
        emprunts.add(emprunt);
        emprunt.getmedia().setCopiesDisponibles(emprunt.getmedia().getCopiesDisponibles() - 1);
    }

    // ------------------------------- Fonctions de Gestion -------------------------------

    public void afficherTousLesEmprunts() {
        for (Emprunt emprunt : emprunts) {
            System.out.println(emprunt);
        }
    }

    public void afficherEmpruntsDuJour() {
        LocalDate aujourdHui = LocalDate.now();
        for (Emprunt emprunt : emprunts) {
            if (emprunt.getDateEmprunt().isEqual(aujourdHui)) {
                System.out.println(emprunt.getAdherent().getNom() + " a emprunté " + emprunt.getmedia().getTitre() + " aujourd'hui.");
            }
        }
    }

    public void afficherEmpruntsDuMois() {
        LocalDate maintenant = LocalDate.now();
        for (Emprunt emprunt : emprunts) {
            if (emprunt.getDateEmprunt().getMonth() == maintenant.getMonth() && emprunt.getDateEmprunt().getYear() == maintenant.getYear()) {
                System.out.println(emprunt.getAdherent().getNom() + " a emprunté " + emprunt.getmedia().getTitre() + " ce mois-ci.");
            }
        }
    }

    public void emprunterMedia(int idMember, String titreMedia) {
        Member Member = null;
        for (Member a : Members) {
            if (a.getIdAdherent() == idMember) {
                Member = a;
                break;
            }
        }

        MediaItem medi = null;
        for (MediaItem mi : media) {
            if (mi.getTitre().equals(titreMedia) && mi.getCopiesDisponibles() > 0) {
                medi = mi;
                break;
            }
        }

        if (Member != null && medi != null) {
            Emprunt emprunt = new Emprunt(medi, Member, LocalDate.now());
            medi.setCopiesDisponibles(medi.getCopiesDisponibles() - 1);
            enregistrerEmprunt(emprunt);
            System.out.println(Member.getNom() + " a emprunté " + medi.getTitre());
        } else {
            System.out.println("L'emprunt ne peut pas être effectué.");
        }
    }

    public void enregistrerRetourMedia(String titreMedia, int idAdherent) {
        for (Emprunt emprunt : emprunts) {
            if (emprunt.getmedia().getTitre().equals(titreMedia) && emprunt.getAdherent().getIdAdherent() == idAdherent) {
                emprunt.setDateRetour(LocalDate.now());
                emprunt.getmedia().setCopiesDisponibles(emprunt.getmedia().getCopiesDisponibles() + 1);
                System.out.println("Le retour de " + titreMedia + " a été enregistré.");
                break;
            }
        }
    }

}

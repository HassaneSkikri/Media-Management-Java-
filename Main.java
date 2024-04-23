import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // 1) Créer la bibliothèque
        Mediatheque Mediatheque = new Mediatheque();

        // 2) Créer des adhérents
        Member adherent1 = new Member("Hassane Skikri", LocalDate.of(2004, 7, 6), 1);
        Member adherent2 = new Member("Ahmed rahiwi", LocalDate.of(2000, 5, 21), 2);

        // 3) Ajouter les adhérents à la bibliothèque
        Mediatheque.ajouterMember(adherent1);
        Mediatheque.ajouterMember(adherent2);

        // 4) Afficher tous les membres

        System.out.println("afficher tous les members");
        Mediatheque.afficherTousLesMembers();

        // 4) Créer des médias
        MediaItem livre = new Book("The inception", 1943, 5, "Antoine", 90);
        MediaItem film = new Movie("Lofi", 2010, 3, LocalDate.of(2010, 7, 16), "Natahovifica");
        MediaItem musique = new Music("mawalo", 1000, 4, "Jacksoooon", "Popiiido");

        // 5)Ajouter les médias à la bibliothèque
        Mediatheque.ajouterMedia(livre);
        Mediatheque.ajouterMedia(film);
        Mediatheque.ajouterMedia(musique);

        // 6)Afficher les médias disponibles
        System.out.println("afficher les medias disponibles");
        Mediatheque.affichermediaDisponibles();

        // 7) Enregistrer des emprunt
        Mediatheque.emprunterMedia(1, "The inception");
        Mediatheque.emprunterMedia(2, "Lofi");

        // 8) Afficher tous les emprunts
        System.out.println("afficher tous les emprunts");
        Mediatheque.afficherTousLesEmprunts();

        // 9) Afficher les emprunts du jour
        System.out.println("les emprunts du jours sont:");
        Mediatheque.afficherEmpruntsDuJour();

        // 10)Enregistrer des retours
        Mediatheque.enregistrerRetourMedia("Le Petit Prince", 1);
        Mediatheque.enregistrerRetourMedia("Inception", 2);

        // 11) Afficher à nouveau les médias disponibles après les retours

        System.out.println("les media dispinible");
        Mediatheque.affichermediaDisponibles();
    }
}

import java.time.LocalDate;

public abstract class MediaItem {
    protected String titre;
    protected int anneePublication;
    protected int copiesDisponibles;

    public MediaItem(String titre, int anneePublication, int copiesDisponibles) {
        this.titre = titre;
        this.anneePublication = anneePublication;
        this.copiesDisponibles = copiesDisponibles;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "titre='" + titre + '\'' +
                ", anneePublication=" + anneePublication +
                ", copiesDisponibles=" + copiesDisponibles +
                '}';
    }

    public String getTitre() { return titre; }
    public void setTitre(String titre) { this.titre = titre; }
    public int getAnneePublication() { return anneePublication; }
    public void setAnneePublication(int anneePublication) { this.anneePublication = anneePublication; }
    public int getCopiesDisponibles() { return copiesDisponibles; }
    public void setCopiesDisponibles(int copiesDisponibles) { this.copiesDisponibles = copiesDisponibles; }
}

class Book extends MediaItem {
    private String auteur;
    private int nombreDePages;

    public Book(String titre, int anneePublication, int copiesDisponibles, String auteur, int nombreDePages) {
        super(titre, anneePublication, copiesDisponibles);
        this.auteur = auteur;
        this.nombreDePages = nombreDePages;
    }

    @Override
    public String toString() {
        return super.toString() + ", auteur='" + auteur + '\'' + ", nombreDePages=" + nombreDePages + '}';
    }

    public String getAuteur() { return auteur; }
    public void setAuteur(String auteur) { this.auteur = auteur; }
    public int getNombreDePages() { return nombreDePages; }
    public void setNombreDePages(int nombreDePages) { this.nombreDePages = nombreDePages; }
}

class Movie extends MediaItem {
    private LocalDate duree;
    private String realisateur;

    public Movie(String titre, int anneePublication, int copiesDisponibles, LocalDate duree, String realisateur) {
        super(titre, anneePublication, copiesDisponibles);
        this.duree = duree;
        this.realisateur = realisateur;
    }

    @Override
    public String toString() {
        return super.toString() + ", duree=" + duree + ", realisateur='" + realisateur + '\'' + '}';
    }

    public LocalDate getDuree() { return duree; }
    public void setDuree(LocalDate duree) { this.duree = duree; }
    public String getRealisateur() { return realisateur; }
    public void setRealisateur(String realisateur) { this.realisateur = realisateur; }
}

class Music extends MediaItem {
    private String artiste;
    private String genre;

    public Music(String titre, int anneePublication, int copiesDisponibles, String artiste, String genre) {
        super(titre, anneePublication, copiesDisponibles);
        this.artiste = artiste;
        this.genre = genre;
    }

    @Override
    public String toString() {
        return super.toString() + ", artiste='" + artiste + '\'' + ", genre='" + genre + '\'' + '}';
    }

    public String getArtiste() { return artiste; }
    public void setArtiste(String artiste) { this.artiste = artiste; }
    public String getGenre() { return genre; }
    public void setGenre(String genre) { this.genre = genre; }
}

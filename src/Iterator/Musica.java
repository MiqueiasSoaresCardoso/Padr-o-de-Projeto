package Iterator;

public class Musica {

    private String titulo;
    private String artista;
    private String link;

    public Musica(String titulo, String artista, String link) {
        this.titulo = titulo;
        this.artista = artista;
        this.link = link;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getArtista() {
        return artista;
    }

    public String getLink() {
        return link;
    }

    @Override
    public String toString() {
        return titulo + " - " + artista;
    }
}

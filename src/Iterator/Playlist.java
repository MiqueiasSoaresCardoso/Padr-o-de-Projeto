package Iterator;

import java.util.ArrayList;
import java.util.List;

public class Playlist {

    private List<Musica> musicas = new ArrayList<>();

    public void adicionarMusica(Musica musica) {
        musicas.add(musica);
    }

    public IteratorMusica criarIterator() {
        return new PlaylistIterator(musicas);
    }
}
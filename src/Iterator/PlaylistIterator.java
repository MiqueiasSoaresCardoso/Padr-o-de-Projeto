package Iterator;

import java.util.List;

public class PlaylistIterator implements IteratorMusica {

    private List<Musica> musicas;
    private int posicao = 0;

    public PlaylistIterator(List<Musica> musicas) {
        this.musicas = musicas;
    }

    @Override
    public boolean temProxima() {
        return posicao < musicas.size();
    }

    @Override
    public Musica proxima() {
        Musica musica = musicas.get(posicao);
        posicao++;
        return musica;
    }
}

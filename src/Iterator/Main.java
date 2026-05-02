package Iterator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Playlist playlist = new Playlist();

        playlist.adicionarMusica(new Musica(
                "A Casa É Sua",
                "Casa Worship",
                "https://www.youtube.com/results?search_query=A+Casa+É+Sua+Casa+Worship"
        ));

        playlist.adicionarMusica(new Musica(
                "Ninguém Explica Deus",
                "Preto no Branco",
                "https://www.youtube.com/results?search_query=Ninguém+Explica+Deus+Preto+no+Branco"
        ));

        playlist.adicionarMusica(new Musica(
                "Raridade",
                "Anderson Freire",
                "https://www.youtube.com/results?search_query=Raridade+Anderson+Freire"
        ));

        playlist.adicionarMusica(new Musica(
                "Todavia Me Alegrarei",
                "Samuel Messias",
                "https://www.youtube.com/results?search_query=Todavia+Me+Alegrarei+Samuel+Messias"
        ));

        playlist.adicionarMusica(new Musica(
                "Bondade de Deus",
                "Isaías Saad",
                "https://www.youtube.com/results?search_query=Bondade+de+Deus+Isaías+Saad"
        ));

        IteratorMusica iterator = playlist.criarIterator();
        PlayerMusica player = new PlayerMusica();
        Scanner scanner = new Scanner(System.in);

        while (iterator.temProxima()) {
            System.out.println("Pressione ENTER para tocar a próxima música...");
            scanner.nextLine();

            Musica musica = iterator.proxima();
            player.tocar(musica);

            System.out.println("Abrindo no navegador: " + musica);
            System.out.println("-----------------------------");
        }

        System.out.println("Fim da playlist.");
        scanner.close();
    }
}

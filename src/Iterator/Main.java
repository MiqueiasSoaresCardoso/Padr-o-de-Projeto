package Iterator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Playlist playlist = new Playlist();

        playlist.adicionarMusica(new Musica(
                "A Casa É Sua",
                "Casa Worship",
                "https://www.youtube.com/watch?v=5QHF5OQeFOs&list=RD5QHF5OQeFOs&start_radio=1"
        ));

        playlist.adicionarMusica(new Musica(
                "Ninguém Explica Deus",
                "Preto no Branco",
                "https://www.youtube.com/watch?v=LYsaKn8FRhc&list=RDLYsaKn8FRhc&start_radio=1"
        ));

        playlist.adicionarMusica(new Musica(
                "Raridade",
                "Anderson Freire",
                "https://www.youtube.com/watch?v=Tqdi6BZUWr4&list=RDTqdi6BZUWr4&start_radio=1"
        ));

        playlist.adicionarMusica(new Musica(
                "Todavia Me Alegrarei",
                "Samuel Messias",
                "https://www.youtube.com/watch?v=81GaF34veWA&list=RD81GaF34veWA&start_radio=1"
        ));

        playlist.adicionarMusica(new Musica(
                "Bondade de Deus",
                "Isaías Saad",
                "https://www.youtube.com/watch?v=mZ9yZYo9Mmk&list=RDmZ9yZYo9Mmk&start_radio=1"
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

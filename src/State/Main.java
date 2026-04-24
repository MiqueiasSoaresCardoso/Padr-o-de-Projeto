package State;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Personagem personagem = new Personagem();

        System.out.println("=== Estado inicial ===");
        personagem.atualizar();

        System.out.println("\n=== Personagem pula ===");
        personagem.pular();

        System.out.println("\n=== Atualizando após pulo ===");
        personagem.atualizar();

        System.out.println("\n=== Personagem ataca ===");
        personagem.atacar();

        System.out.println("\n=== Tentando pular enquanto ataca ===");
        personagem.pular();

        System.out.println("\n=== Finalizando ataque ===");
        personagem.atualizar();

        System.out.println("\n=== Personagem recebe dano ===");
        personagem.receberDano();

        System.out.println("\n=== Atualizando estado ferido ===");
        personagem.atualizar();



    }
}

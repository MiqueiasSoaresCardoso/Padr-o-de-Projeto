package Command;

public class Main {
    public static void main(String[] args) {

        Documento documento = new Documento();
        Editor editor = new Editor();

        Command cmd1 = new InserirTextoCommand(documento, "Olá");
        Command cmd2 = new InserirTextoCommand(documento, " Mundo");
        Command cmd3 = new ApagarTextoCommand(documento, 3);

        System.out.println("=== Execução imediata ===");
        editor.executarComando(cmd1);
        editor.executarComando(cmd2);

        System.out.println("Conteúdo atual: " + documento.getConteudo());

        System.out.println("\n=== Desfazendo último comando ===");
        editor.desfazerUltimoComando();
        System.out.println("Conteúdo atual: " + documento.getConteudo());

        System.out.println("\n=== Adicionando comandos na fila ===");
        editor.adicionarNaFila(new InserirTextoCommand(documento, " Comando"));
        editor.adicionarNaFila(new InserirTextoCommand(documento, " em fila"));
        editor.adicionarNaFila(cmd3);

        System.out.println("\n=== Processando fila ===");
        editor.processarFila();

        System.out.println("Conteúdo final: " + documento.getConteudo());

        System.out.println("\n=== Desfazendo novamente ===");
        editor.desfazerUltimoComando();
        System.out.println("Conteúdo atual: " + documento.getConteudo());
    }
}
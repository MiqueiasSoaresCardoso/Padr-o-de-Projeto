package Composite;

public class Main {
    public static void main(String[] args) {
        Arquivo arq1 = new Arquivo("notas.txt");
        Arquivo arq2 = new Arquivo("foto.png");
        Arquivo arq3 = new Arquivo("trabalho.pdf");

        Pasta documentos = new Pasta("Documentos");
        Pasta imagens = new Pasta("Imagens");
        Pasta raiz = new Pasta("Meu Computador");

        documentos.adicionar(arq1);
        documentos.adicionar(arq3);

        imagens.adicionar(arq2);

        raiz.adicionar(documentos);
        raiz.adicionar(imagens);

        raiz.exibir("");
        arq1.exibir("");
    }
}
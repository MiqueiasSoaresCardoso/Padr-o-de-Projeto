package Visitor;

/*
* Todo objeto que pode ser visitado
*  precisa implementar o método aceitar.
Esse método permite que o visitante entre
*no objeto e execute a operação adequada.
* */
public interface Pessoa {
    void aceitar(Visitante visitante);
}

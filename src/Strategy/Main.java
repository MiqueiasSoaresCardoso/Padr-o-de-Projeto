package Strategy;

public class Main {
    public static void main(String[] args) {

        Pedido p1 = new Pedido(100, new FreteNormal());
        System.out.println("Total com frete normal: R$ " + p1.calcularTotal());

        Pedido p2 = new Pedido(100, new FreteExpresso());
        System.out.println("Total com frete expresso: R$ " + p2.calcularTotal());

        Pedido p3 = new Pedido(100, new FreteGratis());
        System.out.println("Total com frete grátis: R$ " + p3.calcularTotal());
    }
}
package Heranca;

public class Carro extends Automovel{
    private int portas;
    private String tipo;
    private boolean arCondicionado;

    Carro() {

    }

    Carro(String modelo, String fabricante,
          String cor, int ano, double tanque,
          int portas, String tipo, boolean arCondicionado) {
        super(modelo, fabricante, cor, ano, tanque);
        this.portas = portas;
        this.tipo = tipo;
        this.arCondicionado = arCondicionado;
    }
}

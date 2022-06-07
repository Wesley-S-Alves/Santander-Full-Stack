package Heranca;

public class Moto extends Automovel {
    @Override
    String acelerar() {
        return "Raaaaaaam! Pah!";
    }

    public Moto(String modelo, String fabricante, String cor, int ano, double tanque) {
        super(modelo, fabricante, cor, ano, tanque);
    }
}

package Heranca;

public class Caminhao extends Automovel{
    private Double capacidadeCarga;

    Caminhao(){

    }

    public Caminhao(String modelo, String fabricante,
                    String cor, int ano, double tanque,
                    Double capacidadeCarga) {
        super(modelo, fabricante, cor, ano, tanque);
        this.capacidadeCarga = capacidadeCarga;
    }

    @Override
    String acelerar() {
        return "Vrooooooom!";
    }
}

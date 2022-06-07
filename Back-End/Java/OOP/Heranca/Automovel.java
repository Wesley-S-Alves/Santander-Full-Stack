package Heranca;

public class Automovel {
    private String modelo;
    private String fabricante;
    private String cor;
    private int ano;
    private double tanque;

    Automovel(){

    }

    public Automovel(String modelo, String fabricante,
                     String cor, int ano, double tanque) {
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.cor = cor;
        this.ano = ano;
        this.tanque = tanque;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getTanque() {
        return tanque;
    }

    public void setTanque(double tanque) {
        this.tanque = tanque;
    }

    double valorTanque(double valorCombustivel){

        double total = valorCombustivel * this.tanque;

        return total;
    }

    String acelerar(){
        return "Vruuumn";
    }

    String buzinar(){
        return "Pim!Pim!";
    }






}

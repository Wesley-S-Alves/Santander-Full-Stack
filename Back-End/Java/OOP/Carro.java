import java.util.Objects;

public class Carro {
    private String modelo;
    private String marca;
    private String cor;
    private String ano;
    private String consumo;
    private String tamanhoptMalas;
    private String cambio;
    private Integer qtdPortas;
    private Double tanque;
    private Double velocidade;

    public Carro() {

    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getConsumo() {
        return consumo;
    }

    public void setConsumo(String consumo) {
        this.consumo = consumo;
    }

    public String getTamanhoptMalas() {
        return tamanhoptMalas;
    }

    public void setTamanhoptMalas(String tamanhoptMalas) {
        this.tamanhoptMalas = tamanhoptMalas;
    }

    public String getCambio() {
        return cambio;
    }

    public void setCambio(String cambio) {
        this.cambio = cambio;
    }

    public Integer getQtdPortas() {
        return qtdPortas;
    }

    public void setQtdPortas(Integer qtdPortas) {
        this.qtdPortas = qtdPortas;
    }

    public Double getTanque() {
        return tanque;
    }

    public void setTanque(Double tanque) {
        this.tanque = tanque;
    }

    public Double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(Double velocidade) {
        this.velocidade = velocidade;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", cor='" + cor + '\'' +
                ", ano='" + ano + '\'' +
                ", consumo='" + consumo + '\'' +
                ", tamanhoptMalas='" + tamanhoptMalas + '\'' +
                ", cambio='" + cambio + '\'' +
                ", qtdPortas=" + qtdPortas +
                ", tanque=" + tanque +
                ", velocidade=" + velocidade +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Carro carro = (Carro) o;
        return Objects.equals(modelo, carro.modelo)
                && Objects.equals(marca, carro.marca)
                && Objects.equals(cor, carro.cor)
                && Objects.equals(ano, carro.ano)
                && Objects.equals(consumo, carro.consumo)
                && Objects.equals(tamanhoptMalas, carro.tamanhoptMalas)
                && Objects.equals(cambio, carro.cambio)
                && Objects.equals(qtdPortas, carro.qtdPortas)
                && Objects.equals(tanque, carro.tanque)
                && Objects.equals(velocidade, carro.velocidade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(modelo, marca, cor, ano,
                consumo, tamanhoptMalas, cambio,
                qtdPortas, tanque, velocidade);
    }

    public void acelerar(){
        this.velocidade +=10;
        this.tanque-=-1;
    }

    public void frear(){
        this.velocidade-=10;
    }

    public void encheTanque(double qtd){
        this.tanque+= qtd;
    }
}

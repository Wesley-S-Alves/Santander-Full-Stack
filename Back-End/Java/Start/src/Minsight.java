import java.text.DecimalFormat;

public class Minsight {
    public static void main(String[] args) {
        Pessoa a = new Pessoa ("Maria", 80.6);
        Pessoa b = new Pessoa("Carla", 22.0);
        int pistaA = 400;
        int pistaB = 385;
        calculaKM(pistaA, pistaB, a, b);



    }

    static void calculaKM(int pistaA,int pistaB, Pessoa a,Pessoa b){
        DecimalFormat df = new DecimalFormat("#.00");
        double metrosPorMinutoA = (a.getVelocidade()*1000)/60;
        double metrosPorSegundoA = metrosPorMinutoA/60;
        double tempo1 = pistaA/metrosPorSegundoA;
        System.out.println("a primeira concluiu em tempo: " + df.format(tempo1) + "Segundos");
        System.out.println("e faz " + df.format(metrosPorSegundoA) + " metros por Segundos");
        double metrosPorMinutoB = (b.getVelocidade()*1000)/60;
        double metrosPorSegundoB = metrosPorMinutoB/60;
        double tempo2 = pistaB/metrosPorSegundoB;
        System.out.println("A segunda concluiu em tempo: " +df.format(tempo2) + " Segundos");
        System.out.println("e faz " + df.format(metrosPorSegundoB) + " metros por Segundos");
        System.out.println("A diferença de tempo entre os dois foi de: " + df.format(Math.abs(tempo1 - tempo2)));
    }
}


class Pessoa{
    private String nome;
    private Double velocidade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(Double velocidade) {
        this.velocidade = velocidade;
    }

    public Pessoa(String nome, Double velocidade) {
        this.nome = nome;
        this.velocidade = velocidade;
    }
}

package Heranca;

public class main {
    public static void main(String[] args) {
        Carro carro= new Carro("Fox", "VolksWagen","Preto", 2022, 54.7,5,"Hatch", true);
        Moto moto = new Moto("Ninja", "Kawasaki", "Verde", 2018,17.0);
        Caminhao caminhao = new Caminhao("Actros", "Mercedes Benz", "Branco", 2015,210d, 80000d);

        System.out.printf("Carro acelera: %s", carro.acelerar());
        System.out.printf(" Moto acelera: %s", moto.acelerar());
        System.out.println(" Caminhão acelera: " + caminhao.acelerar());
    }
}

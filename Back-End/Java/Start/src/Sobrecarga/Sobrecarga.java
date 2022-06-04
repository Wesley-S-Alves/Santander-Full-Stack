package Sobrecarga;
/*
A capacidade de definir metódos para diferentes contextos, preservando o seu nome
 */
public class Sobrecarga {
    public static void main(String[] args) {
        Quadrilatero.area(5);
        Quadrilatero.area(5,8);
        Quadrilatero.area(6,4,5);
    }
}

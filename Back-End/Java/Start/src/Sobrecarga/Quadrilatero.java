package Sobrecarga;

public class Quadrilatero {

    public static void area(double lado){
        System.out.println("Area do quadrado:" + (lado*lado));
    }

    public static void area(double lado, double lado2){
        System.out.println("Area do retangulo:" + (lado*lado2));
    }

    public static void area(double baseMaior, double baseMenor, double altura){
        System.out.println("Area do quadrado:" + ((baseMaior+baseMenor)*altura)/2);
    }
}

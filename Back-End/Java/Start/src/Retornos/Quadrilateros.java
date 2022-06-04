package Retornos;

public class Quadrilateros {
    public static String area(double lado){
        return  "Area do quadrado:" + (lado*lado);
    }

    public static String area(double lado, double lado2) {
        return "Area do retangulo:" + (lado * lado2);
    }

    public static String area(double baseMaior, double baseMenor, double altura){
        return "Area do quadrado:" + ((baseMaior+baseMenor)*altura)/2;
    }
}

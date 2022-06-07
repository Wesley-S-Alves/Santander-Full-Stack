package Interfaces;

class Calculadora implements OperacaoMatematica{
    @Override
    public void soma(double a, double b) {
        System.out.printf("Soma: "+a+ " + " + b + " = " + (a+b));
    }
    @Override
    public void subtracao(double a, double b) {
        System.out.printf("Subtração:" + a + " - " + b + " = " + (a-b));
    }
    @Override
    public void multiplicacao(double a, double b) {
        System.out.printf("Multiplicação: " + a+ " * " + b + " = " + (a*b));
    }
    @Override
    public void divisao(double a, double b) {
        System.out.printf("Divisão: " + a+ " + " + b + " = " + (a/b));
    }

}

package Metodos;

public class Emprestimo {

    public static String calcular( double valor, int parcela){
        double total = 0;
        double juros = .049; //juros mensal
        total = valor + (valor *(parcela * juros));
        return parcela(valor,parcela,total);
    }

    public static String parcela(double valor, int parcela, double total){
        return "O valor da parcela será de: " + (total / parcela) +
                " com o valor total de :" + total + " e " + (total - valor) +
                " de juros";
    }
}

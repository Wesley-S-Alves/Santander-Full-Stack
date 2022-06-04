package Metodos;

public class Mensagem {
    public static String sauda(int hora){
        String dia;
        if(hora < 6){
            dia = "Ainda de Madrugada";
        } else if (hora < 12) {
            dia = "bom dia";
        } else if (hora < 18){
            dia = "boa tarde";
        } else if(hora < 24) {
            dia = "boa noite";
        }
        else{
            dia = "Horário inválido";
        }
        return dia;
    }

}

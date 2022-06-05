public class Exercicio {
    public static void main(String[] args) {
        System.out.println(mes(1));
        diaSemana("Terça");
        checaNumeros(5);
    }

    public static String mes(int mes){
        String mesEscrito = "";
        if (mes == 1){
            mesEscrito = "Janeiro";
        }else if(mes == 2){
            mesEscrito="Fevereiro";
        }else if (mes == 3){
            mesEscrito = "Março";
        }else if(mes == 4){
            mesEscrito="Abril";
        }else if (mes == 5){
            mesEscrito = "Maio";
        }else if(mes == 6){
        mesEscrito="Junho";
        }else if (mes == 7){
        mesEscrito = "Julho";
        }else if(mes == 8){
            mesEscrito="Agosto";
        }else if (mes == 9){
            mesEscrito = "Setembro";
        }else if(mes == 10){
            mesEscrito="Outubro";
        }else if (mes == 11){
            mesEscrito = "Nobembro";
        }else if(mes == 12){
        mesEscrito="Dezembro";
        }else {
            mesEscrito="Entrada inválida";
        }
        checaFerias(mes);
        return mesEscrito;
    }
    public static void checaFerias(int mes){
        if (mes == 7 || mes == 1 || mes == 12){
            System.out.print("Férias ");
        }
    }

    public static void diaSemana(String dia){
        switch (dia){
            case "Domingo":
                System.out.println("1");
                break;
            case "Segunda":
                System.out.println("2");
                break;
            case "Terça":
                System.out.println("3");
                break;
            case "Quarta":
                System.out.println("4");
                break;
            case "Quinta":
                System.out.println("5");
                break;
            case "Sexta":
                System.out.println("6");
                break;
            case "Sábado":
                System.out.println("7");
                break;
            default:
                System.out.println("Dia da semana inserido é invalido");
        }
    }

    public static void checaNumeros(int num){
        switch (num){
            case 1:
            case 2:
            case 3:
                System.out.println("Certo");
                break;
            case 4:
                System.out.println("Errado");
                break;
            case 5:
                System.out.println("Talvez");
                break;
            default:
                System.out.println("Valor indefinido");
                break;
        }
    }
}

/*
Decisão: if, else if, switch, ternários
repetição: for, while, do while;
interupção: break, continue, return;
 */

public class Fluxo {
    public void decisaoIf(int a,int b){
        if (a > b){
            System.out.println("do Something");
        } else if(a < b) {
            System.out.println("do other thing");
        } else {
            System.out.println("do another thing");
        }
    }
    public void decisaoSwitch(int a){//utilizar para verificação de uma váriavel.
        switch (a){
            case 1:
                System.out.println("do something");
                break;
            case 2:
                System.out.println("do other thing");
                break;
            default:
                System.out.println("do another thing");// utilize para mostrar erros e não de forma genérica
        }
    }

    public String decisaoTernario(int a, int b){
        return (a > b ? "do something": "do other thing");// deve ser evitado ao máximo o seu uso
    }


}

import java.util.Scanner;

public class Ex2_ContadorConsoante {
    public static void contaConsoante(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Contador de vogais e consoantes");
        String word = sc.next();
        int consoantes = 0;
        int vogais = 0;
        for (int i = 0; i < word.length() ; i++) {
            switch (word.charAt(i)){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    vogais+=1;
                    break;
                default:
                    consoantes+=1;
                    break;
            }
        }
        System.out.println("Quantidade de Consoates: " + consoantes);
        System.out.println("Quantidade de Vogais: " + vogais);
    }
}

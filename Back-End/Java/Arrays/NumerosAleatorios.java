import java.util.Random;

public class NumerosAleatorios {
    public static void randomNumbers(){
        int [] vetor = new int[20];
        Random rand= new Random();
        for (int i = 0; i < 20; i++) {
            vetor[i] = rand.nextInt(25);
        }
        for (int num:vetor
             ) {
            System.out.print(num + " ");
        }
    }
}

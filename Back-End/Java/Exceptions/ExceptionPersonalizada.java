import javax.swing.*;
import java.io.*;

public class ExceptionPersonalizada {
    public static void main(String[] args) {
        String nomeArquivo = "romances-blake-crouch.txt";


        imprimirArquivoConsole(nomeArquivo);
        System.out.println("Dando certo ou não, o programa irá continuar.");

    }
    public static void imprimirArquivoConsole(String nomeArquivo)  {
        File file = new File(nomeArquivo);

        try {
            BufferedReader br = new BufferedReader(new FileReader(file.getName()));
            String line = br.readLine();
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            do {
                bw.write(line);
                bw.newLine();
                line = br.readLine();
            } while (line != null);
            bw.flush();
            br.close();
        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }catch (IOException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}

import javax.swing.*;
import java.io.*;

public class CheckedExceptions {
    public static void main(String[] args) {
        String nomeArquivo = "romances-blake-crouch.txt";

        try{
            imprimirArquivoConsole(nomeArquivo);// tratar exception
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null,"Erro ao abrir o arquivo: " + e.getMessage());
        }catch (IOException e){
            JOptionPane.showMessageDialog(null, e.getMessage());

        }
        System.out.println("Dando certo ou não, o programa irá continuar.");

    }
    public static void imprimirArquivoConsole(String nomeArquivo) throws IOException {
    File file = new File(nomeArquivo);

        BufferedReader br = new BufferedReader(new FileReader(file.getName()));
        String line = br.readLine();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        do{
            bw.write(line);
            bw.newLine();
            line=br.readLine();
        }while(line != null);
        bw.flush();
        br.close();
    }
}

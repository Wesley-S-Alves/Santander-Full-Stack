import java.io.*;

public class CheckedExceptions {
    public static void main(String[] args) throws IOException {
        String nomeArquivo = "romances-blake-crouch.txt";
        imprimirArquivoConsole(nomeArquivo);// tratar exception
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

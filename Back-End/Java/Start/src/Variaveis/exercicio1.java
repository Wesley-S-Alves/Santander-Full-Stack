package Variaveis;

public class exercicio1 {
    /**
     * Classe para o primeiro exercicio de Java.
     * Conferindo tipos e nomes permitidos de variáveis
     *
     */
    public static void main(String[] args) {
        int i;
        //int i; // erro de compilação, variável 'i' iniciada duas vezes
        int I; // Java é Case-sensitive;
        //int 1a;// números não podem ser utilizados no inicio do nome de uma variável;
        int _1a;// o '_' pode ser utilizado, mas não é uma boa prática
        final int NUMERO_TENTATIVAS = 5; // para declaração de uma constante, a palavra
        // reservada final deve ser utilizada e o nome escrito em letras maisculas e com
        // o undescore como separador
        int $aq;// o simbolo de cifrão pode ser utilizado, mas não é uma boa prática
        i = 5;
        I = 10;
        _1a =20;

    }
}

package Metodos;
/* Uma porção de código disponibilizada por uma classe
executada quando é feita uma requisição, e é responsável por definir
e realizar um determinado comportamento.
 */

/*<visibilidade> <tipoDeDado> < modificador> retorno nome (<parametro> <excecoes> { corpo }*/
public class metodos {
    public static void main(String[] args) {
        int n1 = 5;
        int n2 = 4;

        //calculadora
        System.out.println("A soma de 5 + 4 é igual a:" + Calculadora.soma(n1,n2));
        System.out.println("A subtração de 5 + 4 é igual a:"
                + Calculadora.subtracao(n1,n2));
        System.out.println("A multiplicação de 5 + 4 é igual a:"
                + Calculadora.multiplicacao(n1,n2));
        System.out.println("A divisão de 5 + 4 é igual a:"
                + Calculadora.divisao(n1,n2));

        // Mensagem
        System.out.println(Mensagem.sauda(25));
        System.out.println(Mensagem.sauda(1));
        System.out.println(Mensagem.sauda(6));
        System.out.println(Mensagem.sauda(15));
        System.out.println(Mensagem.sauda(22));


        // empréstimo
        System.out.println( Emprestimo.calcular(1000, 2));

    }
}

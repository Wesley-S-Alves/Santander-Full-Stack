/*
NOT: ! - inverte o valor lógico
AND: && - verdadeiro se ambas expressões forem verdadeiras
OR:  || - verdadeiro se uma das expressões for verdadeira;
 */

public class Logicos {
    public static void main(String[] args) {
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && false);
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || false);
        System.out.println(!true);
        System.out.println(!false);
    }

}

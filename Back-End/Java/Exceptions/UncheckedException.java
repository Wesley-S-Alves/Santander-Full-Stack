import javax.swing.*;

public class UncheckedException {
    public static void main(String[] args) {
        String a = JOptionPane.showInputDialog("Numerador: ");
        String b = JOptionPane.showInputDialog("Denominador: ");

        int resultado = dividir(a,b);
        System.out.println(resultado);

        System.out.println("Fim");
    }

    public static int dividir(String a, String b){
        boolean looping=true;
        do {
            try{
                int result =((Integer.parseInt(a)) / (Integer.parseInt(b)));
                looping = false;
                return result;
            } catch (NumberFormatException e) { //<- Parse String to Integer error
                JOptionPane.showMessageDialog(null,
                        "Entrada Inválida: " + e.getMessage());
                //e.printStackTrace();
            }catch (ArithmeticException e){ //<- / by zero
                //e.printStackTrace();
                JOptionPane.showMessageDialog(null,"Impossivel dividir por zero!");
            }finally {
                System.out.println("chegou no finally");
            }
        }while(looping);
        return 0;
    }


}

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese un numero");

            String inputLine = entrada.nextLine();
            inputLine = inputLine.replaceAll("[^0-9]","");
            if (inputLine.isEmpty()){
                return;
            }
            int valor;
            valor = Integer.parseInt(inputLine);

            if (valor % 2 == 0) {
                System.out.printf("""
                        ******************************
                        El valor %d es par
                        ******************************
                        """, valor);
            } else {
                System.out.printf("""
                        ******************************
                        El valor %d es impar.
                        ******************************
                        """, valor);
            }
        }
    }
}
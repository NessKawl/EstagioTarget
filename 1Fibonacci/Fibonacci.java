import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        int termos, a, b, c;

        String saida;

        do {
            System.out.print("Entre com a quantidade de termos: ");
            termos = leia.nextInt();

            a = 0;
            b = 1;
            boolean pertence = false; // Variável para verificar se o número pertence à sequência
            saida = "";

            if (termos > 0) {
                for (int contador = 1; contador <= termos; contador++) {
                    saida += a + " ";

                    // Verifica se o número informado é igual a algum termo da sequência
                    if (a == termos) {
                        pertence = true;
                    }

                    c = a + b;
                    a = b;
                    b = c;
                }

                System.out.println("Sequência: " + saida);

                // Exibe se o número pertence ou não à sequência
                if (pertence) {
                    System.out.println("O número " + termos + " pertence à sequência de Fibonacci.");
                } else {
                    System.out.println("O número " + termos + " NÃO pertence à sequência de Fibonacci.");
                }

            } else {
                if (termos < 0) {
                    System.out.println("\nQuantidade inválida!!");
                } else {
                    System.out.println("\nFim do programa!!");
                }
            }

        } while (termos > 0);

    }
}

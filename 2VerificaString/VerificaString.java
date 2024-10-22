import java.util.Scanner;

public class VerificaString {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        String palavra = "";
        int qtdA = 0;
        int qtdAmin = 0;
        int qtdAmaiusc = 0;

        System.out.print("Digite uma palavra qualquer: ");
        palavra = leia.nextLine();

        for (int i = 0; i < palavra.length(); i++) {
            if (palavra.charAt(i) == 'a' || palavra.charAt(i) == 'A') {
                qtdA++;

                if (palavra.charAt(i) == 'a') {
                    qtdAmin++;
                } else {
                    if (palavra.charAt(i) == 'A') {
                        qtdAmaiusc++;
                    }
                }

            }
        }

        System.out.println("A palavra contém " + qtdA + " letras A");
        System.out.println("A: " + qtdAmaiusc);
        System.out.println("a: " + qtdAmin);

    }

}

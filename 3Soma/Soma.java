// A soma resultante dessa operação deve ser 77

public class Soma {

    public static void main(String[] args) {
        
        int indice, soma, k;

        indice = 12;
        soma = 0;
        k = 1;

        while (k < indice) {
            k++;
        
            soma += k;
        }

        System.out.print("Resultado: " + soma);

    }

}

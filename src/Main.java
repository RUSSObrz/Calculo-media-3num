import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main( String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<Float> lista = new ArrayList<>();

        System.out.println("Cálculo de média entre 3 números\n Digite o primeiro número: ");
        float num1 = in.nextFloat();

        System.out.println("Digite o segundo número: ");
        float num2 = in.nextFloat();

        System.out.println("Digite o terceiro número: ");
        float num3 = in.nextFloat();

        lista.add(num1);
        lista.add(num2);
        lista.add(num3);

        float soma = 0;
        for (float numero : lista) {
            soma += numero;
        }

        float resultado = soma / lista.size();
        System.out.println("A média entre os números é: " + resultado);

    }
}

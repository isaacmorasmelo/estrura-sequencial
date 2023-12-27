import java.util.Locale;
import java.util.Scanner;

public class terreno {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a largura do terreno: ");
        double l = sc.nextDouble();

        System.out.print("Digite o comprimento do terreno: ");
        double c = sc.nextDouble();

        System.out.print("Digite o valor do metro quadrado: ");
        double m = sc.nextDouble();

        double area = l * c;
        double preco = area * m;

        System.out.printf("Area do terreno = %.2f\n", area);
        System.out.printf("Preco do terreno = %.2f", preco);

        sc.close();

        System.out.println("teste");
    }
}

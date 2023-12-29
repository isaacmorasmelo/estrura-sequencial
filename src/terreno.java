import java.util.Locale;
import java.util.Scanner;

public class terreno {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.print("digite a largura do terreno: ");
        double largura = sc.nextDouble();

        System.out.print("digite o comprimento do terreno: ");
        double comprimento = sc.nextDouble();

        System.out.print("digite o valor do metro quadrado: ");
        double mq = sc.nextDouble();

        double at = largura * comprimento;
        double pt = mq * at;

        System.out.printf("area do terreno: %.2f\n", at);
        System.out.printf("Preco do terreno = %.2f", pt);


        sc.close();
    }
}

import java.util.Locale;
import java.util.Scanner;

public class medidas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a medida A: ");
        double A = sc.nextDouble();

        System.out.print("Digite a medida B: ");
        double B = sc.nextDouble();

        System.out.print("Digite a medida C: ");
        double C = sc.nextDouble();

        double AQ = A * A;
        double AT = A * B / 2;
        double ATP = (B+A)*C/2;

        System.out.printf("AREA DO QUADRADO: %.4f\n",AQ);
        System.out.printf("AREA DO TRIANGULO: %.4f\n",AT);
        System.out.printf("AREA DO TRAPÉZIO: %.4f",ATP);


    }
}

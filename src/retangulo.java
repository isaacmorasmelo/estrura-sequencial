import java.util.Locale;
import java.util.Scanner;

public class retangulo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.print("Base do Retangulo: ");
        double base = sc.nextDouble();

        System.out.print("Altura do Retangulo: ");
        double altura = sc.nextDouble();

        double area = base * altura;
        double diagonal = Math.sqrt((base * base) + (altura * altura));
        double P = (base * 2) + (altura * 2);


        System.out.printf("AREA: %.4f\n", area);
        System.out.printf("PERIMETRO %.4f\n", P);
        System.out.printf("DIAGONAL: %2f", diagonal);


        sc.close();

    }
}

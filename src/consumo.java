import java.util.Locale;
import java.util.Scanner;

public class consumo {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.print("distancia percorrida: ");
        double dp = sc.nextDouble();

        System.out.print("combutível gasto: ");
        double cg = sc.nextDouble();

        double gm = dp / cg;

        System.out.printf("Consumo médio: %.3f",gm);
    }
}

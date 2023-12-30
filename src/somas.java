import java.util.Locale;
import java.util.Scanner;

public class somas {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.print("digite o valor de X: ");
        int x = sc.nextInt();

        System.out.print("digite o valor de y: ");
        int y = sc.nextInt();

        int soma = y + x;

        System.out.printf("SOMA = %d",soma);
    }
}

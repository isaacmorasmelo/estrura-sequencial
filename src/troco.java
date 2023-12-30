import java.util.Locale;
import java.util.Scanner;

public class troco {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.print("preço unitário do produto: ");
        double pup = sc.nextDouble();

        System.out.print("quantidade comprada: ");
        int q = sc.nextInt();

        System.out.print("dinheiro recebido: ");
        int dr = sc.nextInt();

        double troco = (double) dr - pup * q;

        System.out.printf("TROCO: %.2f",troco);


    }
}

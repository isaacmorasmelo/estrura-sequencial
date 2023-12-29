import java.util.Locale;
import java.util.Scanner;

public class idades {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.println("dados da primeira pessoa:");
        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("Idade: ");
        int I = sc.nextInt();

        System.out.println("dados da segunda pessoa:");
        sc.nextLine();
        System.out.print("Nome: ");
        String nome2 = sc.nextLine();

        System.out.print("Idade: ");
        int I2 = sc.nextInt();

        double IM = (double) (I + I2) / 2;
        System.out.printf("a idade média entre %s e %s é %.1f", nome, nome2,IM);

        sc.close();
    }
}

import java.util.Locale;
import java.util.Scanner;

public class pagamento {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.print("NOME: ");
        String nome = sc.nextLine();

        System.out.print("VALOR POR HORA: ");
        double vph = sc.nextDouble();

        System.out.print("HORAS TRABALHADAS: ");
        int ht = sc.nextInt();

        double pagamento = vph * ht;

        System.out.printf("o pagamento de %s deve ser %.2f",nome,pagamento);
    }
}

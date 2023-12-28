import java.util.Locale;

public class mod_3_aula_5 {

    public static void main(String[] args) {
        String p1 = "Computer";
        String p2 = "Office_desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.00;
        double price2 = 650.50;
        double measure = 53.2345687;

        System.out.println("products");
        System.out.printf("%s, wich price is $ %.2f\n",p1,price1);
        System.out.printf("%s, wich price is $ %.2f\n",p2,price2);
        System.out.println();
        System.out.printf("record: %d years old, code %d and gender: %c\n",age,code,gender);
        System.out.println();
        System.out.printf("measue wich eight decimal places %.8f\n",measure);
        System.out.printf("rouded (three decimal places): %.3f\n",measure);
        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point: %.3f",measure);
    }
}

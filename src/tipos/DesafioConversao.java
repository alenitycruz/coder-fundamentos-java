package tipos;

import java.util.Scanner;

public class DesafioConversao {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite seus ultimos 3 salarios:");
        String valor1 = scan.next().replace(",", ".");
        String valor2 = scan.next().replace(",", ".");
        String valor3 = scan.next().replace(",", ".");

        double salario1 = Double.parseDouble(valor1);
        double salario2 = Double.parseDouble(valor2);
        double salario3 = Double.parseDouble(valor3);

        double mediaSalarial = (salario1 + salario2 + salario3)/3.0;

        System.out.println("Sua media salarial e de: " + mediaSalarial);

        scan.close();

    }
}

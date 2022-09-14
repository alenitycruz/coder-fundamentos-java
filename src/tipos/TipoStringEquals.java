package tipos;
/*
Quando for comparar String é melhor utilizar o ".equals" e não o "=="
 */
import java.util.Scanner;

public class TipoStringEquals {
    public static void main(String[] args) {
        System.out.println("2" == "2");

        String s = new String("2");
        System.out.println("2" == s); //vai dar diferente
        System.out.println("2".equals(s)); //vai dar certo

        Scanner scan = new Scanner(System.in);

        String s2 = scan.next();
        System.out.println("2" == s2);
        System.out.println("2".equals(s));

        System.out.println("2".equals(s2.trim()));

        scan.close();
    }
}

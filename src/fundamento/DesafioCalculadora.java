package fundamento;

import java.util.Scanner;

public class DesafioCalculadora {
    public static void main(String[] args) {

        int num1;
        int num2;
        String op;
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o primeiro valor inteiro:");
        num1 = scan.nextInt();
        System.out.print("Digite o segundo valor inteiro:");
        num2 = scan.nextInt();

        System.out.println("Qual opcao de operador de sua preferencia?");
        op = scan.next();

        // Logica

        int resultado = "+".equals(op)? num1 + num2 : 0;
        resultado = "-".equals(op)? num1 - num2 : resultado;
        resultado = "*".equals(op)? num1 * num2 : resultado;
        resultado = "/".equals(op)? num1 / num2 : resultado;
        resultado = "%".equals(op)? num1 % num2 : resultado;


        System.out.printf("%d %s %d = %d", num1, op, num2, resultado);



        scan.close();
    }
}

package exerciciospropostos;

 /*
 Criar um programa que leia a temperatura em Celsius e converta para Fahrenheit. f 80 c 26,67
 */

import java.util.Scanner;

public class TermometroDois {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor da temperatura em Celsius: ");
        double celcius = scan.nextDouble();
        double fahrenheit = celcius * 1.8 + 32;

        System.out.printf("A temperatura indicada equivale a %.2f Fahrenheit", fahrenheit);

        scan.close();
    }
}

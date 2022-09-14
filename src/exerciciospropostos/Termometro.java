package exerciciospropostos;
/*
Criar um programa que leia a temperatura em Fahrenheit e converta para Celsius.
 */

import java.util.Scanner;

public class Termometro {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor da temperatura em Fahrenheit: ");
        double fahrenheit = scan.nextDouble();
        double celsius = (fahrenheit-32.0)/1.8;

        System.out.printf("A temperatura indicada equivale a %.2f Celsius", celsius);

        scan.close();

    }

}

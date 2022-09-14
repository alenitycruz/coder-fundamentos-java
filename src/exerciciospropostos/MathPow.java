package exerciciospropostos;

import java.util.Scanner;

/*
Criar um programa que leia um valor e apresente os resultados ao quadrado e ao cubo do valor.
 */
public class MathPow {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Valor: ");
        double valor = scan.nextDouble();

        double quadrado = Math.pow(valor,2);
        double cubo = Math.pow(valor,3);

        System.out.printf("Quadrado do valor: %.2f", quadrado);
        System.out.printf("\nCubo do valor: %.2f", cubo);


        scan.close();
    }
}

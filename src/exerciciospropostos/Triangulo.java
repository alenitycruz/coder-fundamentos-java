package exerciciospropostos;
/*
Criar um programa que leia o valor da base e da altura de um triângulo e calcule a área.

 */

import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Base do Triangulo: ");
        double base = scan.nextDouble();

        System.out.print("\nAltura do Triangulo: ");
        double altura = scan.nextDouble();

        double area = (base*altura)/2;

        System.out.printf("Area do Triangulo: %.2f", area);


        scan.close();

    }
}

package exerciciospropostos;

import java.util.Scanner;

/*
Criar um programa que leia o peso e a altura do usuário e imprima no console o IMC.
 */
public class Imc {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Peso: ");
        double peso = scan.nextDouble();

        System.out.println("Altura: ");
        double altura = scan.nextDouble();

        double imc = peso/Math.pow(altura,2);

        System.out.printf("IMC: %.2f", imc);

        scan.close();
    }
}

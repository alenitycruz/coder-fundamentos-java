package tipos;

import javax.swing.*;

public class ConversaoStringNumero {
    public static void main(String[] args) {
        String valor1 = JOptionPane.showInputDialog("Digite o primeiro numero: ");
        String valor2 = JOptionPane.showInputDialog("Digite o segundo numero: ");

        System.out.println(valor1);
        System.out.println(valor2);

        System.out.println(valor1+valor2);

        int numero1 = Integer.parseInt(valor1);
        int numero2 = Integer.parseInt(valor2);

        int soma = numero1 + numero2;
        System.out.println("A soma dos numeros e: " + soma);
        System.out.println("A soma dos media e: " + soma/2);

        String valor3 = JOptionPane.showInputDialog("Qual o valor da sua bolsa estagio ? ");
        String valor4 = JOptionPane.showInputDialog("Qual o valor do seu vale alimentacao ? ");

        double numero3 = Double.parseDouble(valor3);
        double numero4 = Double.parseDouble(valor4);

        double soma1 = numero3 + numero4;

        System.out.println("O total dos seus ganhos e de: " + soma1);
    }
}

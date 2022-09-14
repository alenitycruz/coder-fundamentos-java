package exerciciospropostos;
/*
Criar um programa que resolve equações do segundo grau (ax2 + bx + c = 0)
utilizando a fórmula de Bhaskara. Use como exemplo a = 1, b = 12 e c = -13. Encontre o delta
 */
public class Bhaskara {
    public static void main(String[] args) {
        double a = 1;
        double b = 12;
        double c = -13;

        System.out.println("Dada a Equacao x2 + 12x -13 = 0");

        double deltaAux = Math.pow(b,2.0)-4.0*a*c;

        double aux1 = (-b+Math.sqrt(deltaAux))/2*a;
        double aux2 = (-b-Math.sqrt(deltaAux))/2*a;

        int x1 = (int) aux1;
        int x2 = (int) aux2;
        int delta = (int) deltaAux;

        System.out.printf("\nX1 = %d ; X2 = %d ; Delta = %d", x1, x2, delta);

    }
}

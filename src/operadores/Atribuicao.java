package operadores;

public class Atribuicao {
    public static void main(String[] args) {
        int a = 3;
        int b = a;
        int c = a + b;

        System.out.println(c);

        c += b; // equilatente a --> c = c + b;
        System.out.println(c);
        c -= a; // equilatente a --> c = c - a;
        System.out.println(c);
        c *= b; // equilatente a --> c = c * b;
        System.out.println(c);
        c /= 3; // equilatente a --> c = c / 3;
        System.out.println(c);
        c %= 2;// equilatente a --> c = c % 2; se a divisao por 0 é par se for 1 é impar
        System.out.println(c);
    }
}

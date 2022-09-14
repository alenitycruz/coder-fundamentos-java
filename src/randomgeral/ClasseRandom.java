package randomgeral;

import java.util.Random;

public class ClasseRandom {
    static Random aleatorio = new Random();
    public static void main(String[] args) {


        int valor = aleatorio.nextInt();
        double valor1 = aleatorio.nextDouble(31.1);
        double valor1b = aleatorio.nextDouble()*200.0;
        float valor2 = aleatorio.nextFloat(22.3f);
        float valor2b = aleatorio.nextFloat()*100.0f;
        long valor3 = aleatorio.nextLong();
        boolean valor4 = aleatorio.nextBoolean();
        double valor5 = Math.pow(4,aleatorio.nextExponential());
        double exp = aleatorio.nextExponential();

        System.out.println(valor);
        System.out.println(valor1);
        System.out.println(valor1b);
        System.out.println(valor2);
        System.out.println(valor2b);
        System.out.println(valor3);
        System.out.println(valor4);
        System.out.println(Math.ceil(valor5));
        System.out.println(exp);

        double ale2 = Math.random();

        System.out.println(ale2);

        int ale3 = (int) ale2;

        System.out.println(ale3);


    }
}

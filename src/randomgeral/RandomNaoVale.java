package randomgeral;
/*
O Random não serve para gerar senha. O certo é usar o gerador de numero aleatorio SecureRamdom
 */

import java.util.Random;

public class RandomNaoVale {
    static Random random = new Random();

    static String getToken() {
        return Integer.toString(random.nextInt());
    }

    public static void main(String[] args) {
        System.out.println(getToken());
        System.out.println(getToken());
        System.out.println(getToken());
    }

}

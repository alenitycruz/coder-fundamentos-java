package randomgeral;


import java.security.SecureRandom;

public class SecureRandomVale {
    static SecureRandom random = new SecureRandom();

    static String getToken() {
        return Integer.toString(random.nextInt());
    }

    public static void main(String[] args) {
        System.out.println(getToken());
        System.out.println(getToken());
        System.out.println(getToken());
    }

}

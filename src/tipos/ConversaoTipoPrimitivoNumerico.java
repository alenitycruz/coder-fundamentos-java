package tipos;

/*
Conversão IMPLICITA = DO MENOR PARA O MAIOR
EX double a = 1; --> inteiro(int) para real(double)

Conversão EXPLICITA = DO MAIOR PARA O MENOR
EX int b = 2000000000.0; --> real(double) para inteiro(int)
 */

public class ConversaoTipoPrimitivoNumerico {
    public static void main(String[] args) {
        //conversao implicita
        double a = 1;
        System.out.println(a);

        //conversão explicita - CAST
        float b = (float) 1.1234567888888; //double para float e não sera mostrado todo o valor no console
        System.out.println(b);

        int c = 136;
        byte d = (byte) c;
        System.out.println(d);

        double e = 1;
        int f = (int) e;
        System.out.println(f);
    }
}

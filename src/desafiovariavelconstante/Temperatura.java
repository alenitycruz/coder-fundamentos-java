package desafiovariavelconstante;

public class Temperatura {
    public static void main(String[] args) {
        //(F-32) *5/9 = c
        final double FATOR = 5.0 / 9.0;
        final double AJUSTE = 32.0;
        double fahrenheit = 86.0;
        double celcius = (fahrenheit - AJUSTE) * FATOR;

        System.out.println("A Temperatura de 86.0 Fahrenheit equivale a " + celcius + " Celcius");


        fahrenheit = 90.0;
        celcius = (fahrenheit - AJUSTE) * FATOR;
        System.out.println("A Temperatura de 90.0 Fahrenheit equivale a " + celcius + " Celcius");
    }
}

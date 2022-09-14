package tipos;

//Wrappers são a versão objeto dos tipos primitivos

import java.util.Scanner;

public class Wrapper {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        //byte
        Byte b = 100;
        //short
        Short s = 1000;
        //int
        Integer i = 10000;
        //long
        Long l = 100000L;

        System.out.println(b.byteValue());
        System.out.println(s.toString());

        Integer converter = Integer.parseInt("12345");
        Integer converterEntrada = Integer.parseInt(entrada.nextLine());

        System.out.println(converter);
        System.out.println(converterEntrada);

        System.out.println(i*3);
        System.out.println(l/3);

        Float f = 123.0F;
        System.out.println(f);

        Double d = 123.456;
        System.out.println(d);

        Boolean bo = Boolean.parseBoolean("true");
        System.out.println(bo);
        System.out.println(bo.toString().toUpperCase());

        Character c = '#'; //char
        System.out.println(c + "...");
        System.out.println(c.toString());

        entrada.close();
    }
}

package operadores;

public class Aritmeticos {
    public static void main(String[] args) {
        System.out.println(3+2);

        var x = 34.56;
        double y = 2.2;

        System.out.println(x+y); //adicao
        System.out.println(x-y); //subtracao
        System.out.println(x*y); //multiplicacao
        System.out.println(x/y); //divisao

        int a = 8;
        int b = 3;

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);

        System.out.println(a/(double)b);
        System.out.println(a/(float)b);

        System.out.println(a%b); //modulo
        System.out.println(8%3); //modulo

        System.out.println(x+y-a*b);
    }
}

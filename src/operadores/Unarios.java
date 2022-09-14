package operadores;

public class Unarios {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;

        a++; //equivalente --> a = a+1
        System.out.println(a);
        a--;//equivalente --> a = a-1
        System.out.println(a);

        ++b; //equivalente --> b = b+1
        System.out.println(b);
        --b;//equivalente --> b = b-1
        System.out.println(b);

        System.out.println("Mini Desafio... ");
        System.out.println(++a == b--);
        System.out.println(a == b);
        System.out.println(a);
        System.out.println(b);
    }
}

package variaveleconstante;

public class AreaCircunferencia {
    public static void main(String[] args) {
        //System.out.println(2+3);
        //Uma variável é definida em tipo, nome e valor. Exemplo: int raio = 3;

        double raio = 3.4;
        double pi = 3.14159;

        System.out.println(pi*raio*raio);

        double area = pi * raio * raio;

        System.out.println(area);

        int n1 = 2;
        int n2 = 3;
        final int N3 = n1 + n2;
        //int n3 = 4; Apresentará erro porque o n3 não poderá ser dado outro valor apos o final
        int n4 = 8;
        n4 = 9;
        n1 = 6;

        System.out.println(n1);
        System.out.println(n2);
        System.out.println(N3);
        System.out.println(n4);



    }
}

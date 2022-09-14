package operadores;

public class Logicos {
    public static void main(String[] args) {


        // Tabela verdade E &&
        System.out.println("Tabela verdade E - &&");
        System.out.println("true && true = " + (true&&true));
        System.out.println("true && false = " + (true&&false));
        System.out.println("false && true = " + (false&&true));
        System.out.println("false && false = " + (false&&false));
        System.out.println("===============================");

        // Tabela verdade OU  - ||
        System.out.println("Tabela verdade OU - ||");
        System.out.println("true || true = " + (true||true));
        System.out.println("true || false = " + (true||false));
        System.out.println("false || true = " + (false||true));
        System.out.println("false || false = " + (false||false));
        System.out.println("===============================");

        // Tabela verdade XOR - ^
        System.out.println("Tabela verdade XOR - ^");
        System.out.println("true ^ true = " + (true^true));
        System.out.println("true ^ false = " + (true^false));
        System.out.println("false ^ true = " + (false^true));
        System.out.println("false ^ false = " + (false^false));

        System.out.println("===============================");

        // Tabela verdade Negação
        System.out.println("Tabela verdade Negacao - !");
        System.out.println("!true = " + (!true));
        System.out.println("!!true = " + (!!true));
        System.out.println("!false = " + (!false));
        System.out.println("!!false = " + (!!false));

        System.out.println("===============================");

        boolean condicao1 = true;
        boolean condicao2 = 3>7;

        System.out.println(condicao1 && condicao2);
        System.out.println(condicao1 || condicao2);
        System.out.println(condicao1 ^ condicao2);

        System.out.println(condicao2);
        System.out.println(!condicao2);
        System.out.println(!!condicao2);

        System.out.println(!condicao1);
        System.out.println(!condicao2);
    }
}

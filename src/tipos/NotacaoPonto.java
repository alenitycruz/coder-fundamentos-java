package tipos;

public class NotacaoPonto {
    public static void main(String[] args) {
        //'String" é um tipo não primitivo
        String s = "Bom dia X";
        s.toUpperCase();// só serve para esta linha
        System.out.println(s);

        s = s.toUpperCase(); // atribuiu a variabel s
        System.out.println(s);

        //Substituir
        s = s.replace("X", ", Senhora");
        System.out.println(s);

        //Contatenar em uma variavel String já existente
        s = s.concat("!!!");
        System.out.println(s);

        System.out.println("Alessandra".toUpperCase());

        String x = "Severido Portoes".toUpperCase();
        System.out.println(x);

        String y = "Bom diaX".replace("X", ", Steven Jobs");
        System.out.println(y);

        String z = s.replace(", Senhora!!!", "Gui");
        System.out.println(z);
        z = s.replace(", Senhora!!!", "Gui").toUpperCase();
        System.out.println(z);
        z = s.replace(", Senhora!!!", "Gui").toUpperCase().concat(" !!!");
        System.out.println(z);

        //Tipos primitivos não tem o operador "."
        //A notacao "." da acesso a outras funcionalidades

    }
}

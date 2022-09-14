package tipos;

public class Inferencia {
    public static void main(String[] args) {
        double a = 4.5;
        System.out.println(a);

        var b = 4.5;
        System.out.println(b);
        //var é a inferencia que sugere o tipo de variavel de um dado de acordo com o valor apresentado

        var nome = "Mario Bros";
        System.out.println(nome);

        nome = "Chitãozinho e Xororó";
        System.out.println(nome);

        // nome = 2; não aceita pois esta diferente do suposto tipo da primeira vez
        System.out.println(nome);

    }
}

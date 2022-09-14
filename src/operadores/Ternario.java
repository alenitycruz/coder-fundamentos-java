package operadores;

public class Ternario {
    public static void main(String[] args) {

        double media = 7.6;
        String resultado = media >= 7.0 ? "Aprovado" : "Reprovado";

        System.out.println("O aluno esta " + resultado);

        double media2 = 5.6;
        String resultadoParcial = media2 >=5 ? "em recuperacao" : "reprovado";
        String resultadoFinal = media2 >= 7 ? "aprovado" : resultadoParcial;

        System.out.println("O aluno esta " + resultadoFinal);

        double media3 = 9.9;
        boolean bomComportamento = true;
        boolean passouPorMedia = media3 >= 7;
        boolean temDesconto = !bomComportamento && passouPorMedia;
        String resultado2 = temDesconto ? "sim" : "nao";

        System.out.println("Tem desconto " + resultado2);

        System.out.printf("Tem desconto %s", resultado2);
    }
}

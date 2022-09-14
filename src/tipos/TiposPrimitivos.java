package tipos;

public class TiposPrimitivos {
    public static void main(String[] args) {
        //Informações dos Funcionários

        //Tipos numeros inteiros
        byte anosDeEmpresa = 23;
        short numerosDevoos = 542;
        int id = 56789;
        long pontosAcumulados = 2_134_845_223_000L;

        //Tipos numéricos reais
        float salario = 11_445.44F;
        double vendasAcumuladas = 2_991_797_103.01;

        //Tipo booleano
        boolean estaDeFerias = false;

        //Tipo Caractere
        char status = 'A'; // ativo

        //Dias de empresa
        System.out.println(anosDeEmpresa*365);

        //Numero de viagens
        System.out.println(numerosDevoos/2);

        //Pontos por real
        System.out.println(pontosAcumulados/vendasAcumuladas);

        System.out.println(id + " ganha " + salario);

        System.out.println("Está de férias? " +estaDeFerias);

        System.out.println("Status: " + status);
    }
}

package tipos;

public class TipoString {
    public static void main(String[] args) {
        System.out.println("Bom dia".charAt(0));
        System.out.println("Bom dia".charAt(1));
        System.out.println("Bom dia".charAt(2));
        System.out.println("Bom dia".charAt(3));
        System.out.println("Bom dia".charAt(4));
        System.out.println("Bom dia".charAt(5));
        System.out.println("Bom dia".charAt(6));

        String s = "Boa tarde";
        s = s.toUpperCase();
        System.out.println(s.concat("!!!"));
        System.out.println(s + "!!!");
        System.out.println(s.startsWith("BOA"));
        System.out.println(s.toLowerCase().startsWith("boa"));
        System.out.println(s.length());
        System.out.println(s.endsWith("TARDE"));
        System.out.println(s.equals("BOA TARDE"));
        System.out.println(s.equalsIgnoreCase("Boa tarde"));

        var nome = "Petrucio";
        var sobrenome = "Amorim";
        var idade = 66;
        var salario = 25000.0F;

        System.out.println("Nome: " + nome
        + "\nSobrenome: " + sobrenome
        + "\nIdade: " + idade
        + "\nSalario: " + salario);

        String maisUmaFrase = "Nome " + nome + " Sobrenome " + sobrenome + " Idade " + idade + " Salario " + salario;

        System.out.println(maisUmaFrase);

        System.out.println("Frase qualquer".contains("qual"));
        System.out.println("Frase qualquer".indexOf("qual"));
        System.out.println("Frase qualquer".substring(6));
        System.out.println("Frase qualquer".substring(6, 10));
    }
}

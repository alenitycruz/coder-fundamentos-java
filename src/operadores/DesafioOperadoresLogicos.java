package operadores;

public class DesafioOperadoresLogicos {
    public static void main(String[] args) {
        // Trabalho na terça (V ou F)
        // Trabalho na quinta (V ou F)

        // Se os dois trabalhos derem certo irei comprar 1 tv 50" no fim de semana
        // Se um dos dois trabalhos der certo irei comprar 1 tv 30" no fim de semana
        // ou comprando uma tv de 30" ou de 50" irao tomar um sorvete juntos

        boolean trabalhoterca = true;
        boolean trabalhoquinta = true;

        boolean tvCinquenta = trabalhoquinta && trabalhoterca;
        boolean tvTrinta = !trabalhoterca || trabalhoquinta && trabalhoterca || !trabalhoquinta;
        boolean tomarSoverte = (!tvCinquenta || tvTrinta) || (tvCinquenta || !tvTrinta);

        System.out.println("Tomou sorvete? " + !tomarSoverte + " => Entao esta mais saudavel");

    }
}

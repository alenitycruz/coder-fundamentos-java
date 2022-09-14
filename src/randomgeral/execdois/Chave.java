package randomgeral.execdois;

import java.util.Random;

public class Chave {

    private int [] numeros;
    private int [] estrelas;

    public boolean existe(int [] vetor, int n) {
        for (int i = 0 ; i < vetor.length ; i++) {
            if (vetor[i] == n) {
                return true;
            }
        }
        return false;
    }

    public void gerarNumeros() {
        numeros = new int[5];
        Random random = new Random();
        int gerado;

        for (int i = 0 ; i < 5 ; i++) {

            gerado = random.nextInt(51);

            while(existe(numeros,gerado)){
                gerado = random.nextInt(51);
            }

            numeros[i] = gerado;
        }
    }

    public void gerarEstrelas() {
        estrelas = new int[2];

        Random random = new Random();
        int gerado1;

        for (int i = 0 ; i < 2 ; i++) {

            gerado1 = random.nextInt(13);

            while(existe(estrelas,gerado1)){
                gerado1 = random.nextInt(13);
            }

            estrelas[i] = gerado1;
        }
    }

    public void mostraChave() {
        for (int i = 0 ; i < numeros.length ; i++) {
            System.out.print(numeros[i] + " ");
        }

        System.out.println("\nEstrelas: ");

        for (int i = 0 ; i < estrelas.length ; i++) {
            System.out.print(estrelas[i] + " ");
        }
    }

}

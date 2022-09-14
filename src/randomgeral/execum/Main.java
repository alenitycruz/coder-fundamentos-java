package randomgeral.execum;

/*
Desenvolva uma função que gere uma aposta do Euromilhões aleatória.
Cada aposta é composta por 5 números de 1 a 50 e 2 estrelas de 1 a 12.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        Numeros n = new Numeros();
        n.setNum1(random.nextInt(51));
        n.setNum2(random.nextInt(51));
        n.setNum3(random.nextInt(51));
        n.setNum4(random.nextInt(51));
        n.setNum5(random.nextInt(51));



        List<Integer> numeros = new ArrayList<>();
        numeros.add(n.getNum1());
        numeros.add(n.getNum2());
        numeros.add(n.getNum3());
        numeros.add(n.getNum4());
        numeros.add(n.getNum5());

        System.out.println(numeros);

        Estrela e = new Estrela();
        e.setEstrela1(random.nextInt(13));
        e.setEstrela2(random.nextInt(13));

        List<Integer> estrelas = new ArrayList<>();
        estrelas.add(e.getEstrela1());
        estrelas.add(e.getEstrela2());

        System.out.println(estrelas);

        Aposta euroMil = new Aposta(numeros, estrelas);

        System.out.println(euroMil);



    }
}

package randomgeral.execum;

import java.util.List;

public class Aposta {

    private List<Integer> numeros;
    private List<Integer> estrelas;

    public Aposta() {
    }

    public Aposta(List<Integer> numeros, List<Integer> estrelas) {
        this.setNumeros(numeros);
        this.setEstrelas(estrelas);
    }

    public List<Integer> getNumeros() {
        return numeros;
    }

    public void setNumeros(List<Integer> numeros) {
        this.numeros = numeros;
    }

    public List<Integer> getEstrelas() {
        return estrelas;
    }

    public void setEstrelas(List<Integer> estrelas) {
        this.estrelas = estrelas;
    }

    @Override
    public String toString() {
        return "Aposta{" +
                "numeros=" + this.getNumeros() +
                ", estrelas=" + this.getEstrelas() +
                '}';
    }
}

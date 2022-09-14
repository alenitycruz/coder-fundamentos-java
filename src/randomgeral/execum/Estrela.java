package randomgeral.execum;


public class Estrela {


    private int estrela1;
    private int estrela2;

    public Estrela() {
    }

    public Estrela(int estrela1, int estrela2) {
        this.setEstrela1(estrela1);
        this.setEstrela2(estrela2);
    }

    public int getEstrela1() {
        return estrela1;
    }

    public void setEstrela1(int estrela1) {
        this.estrela1 = estrela1;
    }

    public int getEstrela2() {
        return estrela2;
    }

    public void setEstrela2(int estrela2) {
        this.estrela2 = estrela2;
    }

    @Override
    public String toString() {
        return "Estrela{" +
                "estrela1=" + this.getEstrela1() +
                ", estrela2=" + this.getEstrela2() +
                '}';
    }
}

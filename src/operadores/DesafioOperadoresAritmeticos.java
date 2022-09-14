package operadores;

public class DesafioOperadoresAritmeticos {
    public static void main(String[] args) {
        double auxA = 6*(3+2);
        double numA = auxA*auxA;
        double denA = 3*2;
        double superiorA = numA/denA;

        double numB = (1-5)*(2-7);
        double denB = 2;
        double auxB = numB/denB;
        double superiorB = auxB*auxB;

        double auxSuperUm = superiorA-superiorB;
        double auxSuperDois = auxSuperUm*auxSuperUm*auxSuperUm;
        double inferior = 10*10*10;

        double superior = auxSuperDois/inferior;

        System.out.println((int)superior);
    }
}

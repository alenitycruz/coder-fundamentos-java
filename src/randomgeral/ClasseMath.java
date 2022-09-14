package randomgeral;


public class ClasseMath {
    public static void main(String[] args) {
        int x = 3;
        int y = 4;
        double z = 81.56;

        System.out.println("PI vale: " + Math.PI);
        System.out.println("O valor absoluto de X e: " + Math.abs(x));
        System.out.println("O maior valor entre x e y e: " + Math.max(x, y));
        System.out.println("O menor valor entre x e y e: " + Math.min(x, y));
        System.out.println("A raiz quadrada de z e: " + Math.sqrt(z));
        System.out.println("z arredendado para cima e: " + Math.ceil(z));
        System.out.println("z arredendado para baixo e: " + Math.floor(z));
        System.out.println("Numero aleatorio gerado: " + Math.random());
        System.out.println("A hipotenusa de x e y e: " + Math.hypot(x, y));
        System.out.println("O seno de 90 graus e: " + Math.sin(Math.PI/2));
        System.out.println(Math.abs(z));

        double a = 9.0;
        System.out.println("A raiz cubica de 9 e: " + Math.ceil(Math.cbrt(a)));

        double num1 = Math.random();
        double num2 = Math.random();
        double f = Math.random()/Math.nextDown(1.0);
        double num = num1*(1.0 - f) + num2*f;

        System.out.println(Math.ceil(num));
        System.out.println(Math.ceil(num1));
        System.out.println(Math.ceil(num2));
        System.out.println(Math.ceil(f));



    }
}

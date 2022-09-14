package tipos;

public class PrimitivoVsObjeto {
    public static void main(String[] args) {
        //String s = "texto";
        //s.toUpperCase();

        String z = new String("Texto");
        z.toUpperCase();

        //System.out.println(s);
        System.out.println(z);

        //Wrappers são a versão objeto dos tipos primitivos
        int i = 1234;
        System.out.println(i);
    }
}

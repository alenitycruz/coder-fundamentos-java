package tipos;

import javax.swing.*;
import java.util.Date;

public class Imports {
    public static void main(String[] args) {
        //Não precisa de imports porque esta dentro do pacote basico JAVA
        String s = "Bom dia";
        System.out.println(s);

        //Precisam de imports, pois não esta dentro do pacote basico JAVA
        //E é necessario a utilização de outra biblioteca
        Date d = new Date();
        System.out.println(d);

        JButton button = new JButton();
        System.out.println(button);
    }
}

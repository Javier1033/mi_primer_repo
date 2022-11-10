
package Ejercicios;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class ejercicio_2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int lit,gal;
        double pre;
        
        System.out.print("ingrese el valor de la leche que vende en galones..:");
        pre=entrada.nextDouble();
        System.out.print("Ingrese los galones que vendio en el dia..:");
        gal=entrada.nextInt();
        lit=gal*3785;
        System.out.print("los litros que vendio hoy son "+lit+", que da el valor de..:"+gal*pre);
        
        /*
        pre=Double.parseDouble(JOptionPane.showInputDialog("ingrese el valor de la leche que vende en galones..:"));
        gal=Integer.parseInt(JOptionPane.showInputDialog("Ingrese los galones que vendio en el dia..:"));
        lit=gal*3785;
        JOptionPane.showMessageDialog(null, "los litros que vendio hoy son "+lit+", que da el valor de..:"+gal*pre);
        */
    }
}

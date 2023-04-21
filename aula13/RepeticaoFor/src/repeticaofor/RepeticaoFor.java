/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repeticaofor;

/**
 *
 * @author rafae
 */
public class RepeticaoFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*
        for (int cc=1; cc<=4; cc++) {
            System.out.println("Cambalhota: " + cc);
        }
        */
        
        /*
        int cc = 0;
        while (cc <= 3) {
            System.out.println("Cambalhota: " + cc);
            cc++;
        }
        */
        
        for (int i=0; i<=100; i+=10) {
            System.out.print(i + " , ");
        }
    }
}
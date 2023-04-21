/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contador01;

/**
 *
 * @author rafae
 */
public class Contador01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int cc = 0;
        
        /*CONTADOR 1 - 4
        while (cc <=4) {
            System.out.println(cc + " Cambalhota");
            cc++;
        }
        */
        
        /* CONTADOR 1 - 10 (EXCETO 5 e 7)
        while (cc <10) {
            cc++;
            if (cc == 5 || cc == 7 || cc == 9) {
            continue;
            }
            System.out.println(cc + " Cambalhota");
        }
        */
        
        /* CONTADOR 1 - 10 (EXCETO 5 , 7 , 9)*/
        while (cc <10) {
            cc++;
            if (cc == 2 || cc == 3 || cc == 4) {
            continue;
            }
            if (cc == 7) {
                break;
            }
            System.out.println(cc + " Cambalhota");
        }
    }
}
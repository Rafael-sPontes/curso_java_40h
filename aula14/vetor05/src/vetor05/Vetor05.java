/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetor05;

import java.util.Arrays;

/**
 *
 * @author rafae
 */
public class Vetor05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int v[] = new int[20];
        int c = 0;
        Arrays.fill(v, 0);
        for (int valor: v) {
            System.out.print("p[" + c + "]-> ");
            System.out.println(valor + " . ");
            c++;
        }
    }
}
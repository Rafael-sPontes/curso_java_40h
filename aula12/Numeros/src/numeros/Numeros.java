/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numeros;

import java.util.Scanner;

/**
 *
 * @author rafae
 */
public class Numeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int n, s = 0;
        String resp;
        
        Scanner tec = new Scanner(System.in);
        
        do {
            System.out.print("Digite um número: ");
            n = tec.nextInt();
            s += n;
            System.out.print("Quér Continuar? [S/N]: ");
            resp = tec.next();
        } while (resp.equals("S") || resp.equals("s")) ;
        System.out.println("A soma de todas os valores é: " + s);
    }
}
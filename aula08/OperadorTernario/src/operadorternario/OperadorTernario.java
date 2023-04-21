/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operadorternario;

/**
 *
 * @author rafae
 */
public class OperadorTernario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        /* RESULTADO FALSE (1)
        int n1, n2, r;
        n1 = 4;
        n2 = 8;
        r = (n1>n2) ? 0:1;
        System.out.println("Resultado: " + r);
        */
        
        /* RESULTADO TRUE (0)
        int n1, n2, r;
        n1 = 14;
        n2 = 8;
        r = (n1>n2) ? 0:1;
        System.out.println("Resultado: " + r);
        */
        
        /* RESULTADO TRUE (n1 = 14)
        int n1, n2, r;
        n1 = 14;
        n2 = 8;
        r = (n1>n2) ? n1:n2;
        System.out.println("Resultado: " + r);
        */
        
        /* RESULTADO FALSE (n2 = 18)
        int n1, n2, r;
        n1 = 14;
        n2 = 18;
        r = (n1>n2) ? n1:n2;
        System.out.println("Resultado: " + r);
        */
        
        /* RESULTADO FALSE (n1 - n2 = -4)
        int n1, n2, r;
        n1 = 14;
        n2 = 18;
        r = (n1>n2) ? n1+n2:n1-n2;
        System.out.println("Resultado: " + r);
        */
        
        /* RESULTADO FALSE (n1 + n2 = 22)*/
        int n1, n2, r;
        n1 = 14;
        n2 = 8;
        r = (n1>n2) ? n1+n2:n1-n2;
        System.out.println("Resultado: " + r);
    }   
}
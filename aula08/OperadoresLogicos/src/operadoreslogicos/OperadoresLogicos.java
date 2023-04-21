/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operadoreslogicos;

/**
 *
 * @author rafae
 */
public class OperadoresLogicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int x, y, z;
        x = 4;
        y = 7;
        z = 12;
        boolean r;
        
        /* VERIFICANDO SE &&(E) TRUE (V e V = V)
        r = (x<y && y<z) ? true:false;
        System.out.println("Resultado: " + r);
        */
        
        /* VERIFICANDO SE &&(E) FALSE (V e F = F)
        r = (x<y && x==z) ? true:false;
        System.out.println("Resultado: " + r);
        */
        
        /* VERIFICANDO SE &&(OU) TRUE (V ou F = V)
        r = (x<y || x==z) ? true:false;
        System.out.println("Resultado: " + r);
        */
        
        /* VERIFICANDO SE ||(XOU) TRUE (V xou F = V)
        r = (x<y ^ x==z) ? true:false;
        System.out.println("Resultado: " + r);
        */
        
        /* VERIFICANDO SE ||(XOU) TRUE (V xou F = F) */
        r = (x<y ^ x<z) ? true:false;
        System.out.println("Resultado: " + r);
    }
}
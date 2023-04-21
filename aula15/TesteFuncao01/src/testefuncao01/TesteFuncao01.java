/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testefuncao01;

/**
 *
 * @author rafael
 */
public class TesteFuncao01 {

    /**
     * @param args the command line arguments
     */
    
    /* FUNÇÃO INT (COM RETORNO)*/
    static int soma(int a, int b) {
        int s = a+b;
        return s;
    }
    
    /* MÉTODO ESTÁTICO (SEM RETORNO)
    static void soma(int a, int b) {
        int s = a+b;
        System.out.println("A soma é: " + s);
    }
    */
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        /* CHAMADA da FUNÇÃO INT (COM RETORNO)*/
        System.out.println("- Começou o programa -");
        int s = soma(5, 2);
        System.out.println("A soma é: "+ s);
        
        /* CHAMADA do MÉTODO ESTÁTICO
        System.out.println("- Começou o programa -");
        soma(5,2);
        */
    }
}
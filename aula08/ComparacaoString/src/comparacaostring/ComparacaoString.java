/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package comparacaostring;

/**
 *
 * @author rafae
 */
public class ComparacaoString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String nome1 = "Gustavo";
        String nome2 = "Gustavo";
        String nome3 = new String("Gustavo");
        String res1, res2, res3;
        
        /* VERIFICAR SE AS VARIÁVEIS SÃO IGUAIS (TRUE)*/
        res1 = (nome1 == nome2) ? "igual":"diferente";
        
        /* VERIFICAR SE AS VARIÁVEIS SÃO IGUAIS (FALSE)*/
        res2 = (nome1 == nome3) ? "igual":"diferente";
        
        /* VERIFICANDO SE O CONTEÚDO DENTRO DOS OBJETOS SÃO IGUAIS (TRUE)*/
        res3 = (nome1.equals(nome3)) ? "igual":"diferente";
        
        System.out.println("Resultado res1: " + res1);
        System.out.println("Resultado res2: " + res2);
        System.out.println("Resultado res3: " + res3);
    }    
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programaidade;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author rafae
 */
public class ProgramaIdade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Date cl = new Date();
        int y = cl.getYear() + 1900;
        
        Scanner teclado = new Scanner(System.in);
        
        //Entrada de Dados
        System.out.print("Digite o ano de Nascimento: ");
        int nasc = teclado.nextInt();
        
        int idade = y - nasc;
        
        //Processamento de Dados
        if (idade >= 18) {
            //Saída de Dados
            System.out.println("Sua idade é: " + idade + " anos, portanto já é MAIOR de Idade");
        } else {
            //Saída de Dados
            System.out.println("Sua idade é: " + idade + " anos, portanto ainda é MENOR de Idade");
        }
    }
}
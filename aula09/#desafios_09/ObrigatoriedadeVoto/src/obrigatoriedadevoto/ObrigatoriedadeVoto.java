/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package obrigatoriedadevoto;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author rafae
 */
public class ObrigatoriedadeVoto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Date cl = new Date();
        int y = cl.getYear() + 1900;
        
        Scanner teclado = new Scanner(System.in);
        
        //Entrada de Dados
        System.out.print("Digite sua data de Nascimento: ");
        int nasc = teclado.nextInt();
        
        //Processamento de Dados
        int idade = y - nasc;
        
        //Condicional
        if ((idade >= 16 && idade <18) || (idade > 70)) {
            System.out.println("Idade: " + idade + " anos, Voto OPCIONAL");
        } else if (idade >= 18 && idade <= 70) {
            System.out.println("Idade: " + idade + " anos, Voto OBRIGATÓRIO");
        } else {
            System.out.println("Idade: " + idade + " anos, NÃO VOTA");
        }
    }
}
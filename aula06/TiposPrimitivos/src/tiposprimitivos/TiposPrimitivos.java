/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tiposprimitivos;

import java.util.Scanner;

/**
 *
 * @author rafae
 */
public class TiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /* COM ENTRADA DE DADOS*/
        Scanner teclado = new Scanner(System.in);
        
        /*Declaração de Variáveis  Entrada de dados*/
        System.out.println("Digite o nome do aluno: ");
        String nome = teclado.nextLine();
        System.out.println("Digite a nota do aluno: ");
        float nota = teclado.nextFloat();
        
        /*Saída de Dados*/
        System.out.format("A nota de %s é: %.1f \n", nome, nota);
        
        /* SEM ENTRADA DE DADOS
        //Declaração de Variáveis  Entrada de dados
        //String nome = "Gustavo";
        //float nota = 8.5f;
        //float nota = (float) 8.5;
        //float nota = new float(8.5);
        
        //Saída de Dados//
        //System.out.println("A nota de " + nome + " é: " + nota);
        //System.out.printf("A nota de %s é: %.4f \n", nome, nota);
        //System.out.format("A nota de %s é: %.1f \n", nome, nota);
        */
    }
}
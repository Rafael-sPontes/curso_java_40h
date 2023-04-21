/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciorepita;

import javax.swing.JOptionPane;

/**
 *
 * @author rafae
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //JOptionPane.showMessageDialog(null, "Olá, Mundo!", "Boas Vindas", JOptionPane.WARNING_MESSAGE);
        
        /*
        int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um número: "));
        JOptionPane.showMessageDialog(null, "Você digitou o valor " + n);
        */
        
        int n, tv = 0, tp = 0, ti = 0, ac = 0, mv = 0, s = 0;
        
        do {
            n = Integer.parseInt(JOptionPane.showInputDialog(null, 
                    "<html>Informe um número: <br><em>(valor 0 interrompe)</html>"));
            
            //Soma dos Valores
            s += n;
            
            //Total de Valores
            tv++;
            
            //Total de Pares / Ímpares
            if (n % 2 == 0) {
                //Total de Pares
                tp++;
            } else {
                //Total de Ímpares
                ti++;
            }
            
        } while(n != 0);
        
        tv -= 1;
        tp -= 1;
        
        //Média dos Valores
        mv = s / tv;
        
        JOptionPane.showMessageDialog(null, "<html>Resultado Final <hr>"
                + "Somatória Vale: " + s
                + "<br> Total de Valores: " + tv
                + "<br> Total de Pares: " + tp
                + "<br> Total de Ímpares: " + ti + "<br> Acima de 100: " + ac
                + "<br> Média dos Valores: " + mv);
    }
}
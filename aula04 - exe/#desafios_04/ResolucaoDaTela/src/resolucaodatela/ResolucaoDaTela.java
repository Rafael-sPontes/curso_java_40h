/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package resolucaodatela;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author rafae
 */
public class ResolucaoDaTela {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
        
        int width = (int)size.getWidth();
        int height = (int)size.getHeight();
        
        System.out.println("Resolução da Tela: " + width + " x " + height);
    }   
}
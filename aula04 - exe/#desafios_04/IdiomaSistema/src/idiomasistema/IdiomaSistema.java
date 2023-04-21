/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package idiomasistema;

import java.util.Locale;

/**
 *
 * @author rafae
 */
public class IdiomaSistema {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*String lang = System.getProperty("user.language");
        System.out.println("Idioma do Sistema: " + lang);*/
        
        Locale currentLocale = Locale.getDefault();
        System.out.println("Idioma do Sistema: " + currentLocale.getDisplayLanguage());
    }   
}
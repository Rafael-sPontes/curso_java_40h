/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operadoresaritmeticos;

/**
 *
 * @author rafae
 */
public class OperadoresAritmeticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*
        int n1 = 3;
        int n2 = 5;
        float m = (n1+n2) / 2;
        System.out.println("A média é igual: " + m);
        */
        
        /* RESULTADO 6 (INCREMENTO)
        int numero = 5;
        numero++;
        System.out.println("numero: " + numero);
        */
        
        /* RESULTADO 4 (DECREMENTO)
        int numero = 5;
        numero--;
        System.out.println("numero: " + numero);
        */
        
        /* RESULTADO 10 (PÓS INCREMENTO)
        int numero = 5;
        System.out.println("numero: " + numero);
        int valor = 5 + numero++;
        System.out.println("valor: " + valor);
        */
        
        /* RESULTADO 11 (PRÉ INCREMENTO)
        int numero = 5;
        System.out.println("numero: " + numero);
        int valor = 5 + ++numero;
        System.out.println("valor: " + valor);
        */
        
        /* RESULTADO 14 (PÓS DECREMENTO)
        int numero = 10;
        System.out.println("numero: " + numero);
        int valor = 4 + numero--;
        System.out.println("valor: " + valor);
        */
        
        /* ATRIBUIÇÃO (+)
        int x = 4;
        System.out.println("x: " + x);
        x += 2; // x = x + 2;
        System.out.println("x += 2 => " + x);
        */
        
        /* ATRIBUIÇÃO (*)
        int x = 4;
        System.out.println("x: " + x);
        x *= 2; // x = x + 2;
        System.out.println("x *= 2 => " + x);
        */
        
        /* ARREDONDAMENTOS
        float v1 = 8.9f;
        float v11 = v1;
        float v2 = 8.5f;
        float v22 = v2;
        float v3 = 8.9f;
        float v33 = v3;
        float v4 = 8.4f;
        float v44 = v4;
        int arf = (int) Math.floor(v1);
        int arc = (int) Math.ceil(v2);
        int arr1 = (int) Math.round(v3);
        int arr2 = (int) Math.round(v4);
        System.out.println(v11 + " arr_baixo (floor): " + arf);
        System.out.println(v22 + " arr_cima (ceil): " + arc);
        System.out.println(v33 + " arr_arit (round): " + arr1);
        System.out.println(v44 + " arr_arit (round): " + arr2);
        */
        
        /* NÚMERO RANDÔMICO ( -0 )
        double ale = Math.random();
        System.out.println("Valor aleatório: " + ale);
        */
        
        /* NÚMERO RANDÔMICO (5 até 10)
        double ale = Math.random();
        int n = (int)(5 + ale * (10-5));
        System.out.println("Valor aleatório: " + n);
        */
        
        /* NÚMERO RANDÔMICO (15 até 50) */
        double ale = Math.random();
        int n = (int)(5 + ale * (50-15));
        System.out.println("Valor aleatório: " + n);
    }
}

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class ejerc05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("con esta clase guardamos valores ingresados por consola en la variable");
        System.out.println("Ingresa tu nombre");
        String nombre = leer.nextLine();
        System.out.println("Ingresa tu edad");
        int edad = leer.nextInt();
        
        System.out.println("nombre "+nombre);
        System.out.println("edad "+ edad);
        
    }
    
}

        
    
    



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
public class ejerc07 {

    public static void main(String[] args){
     Scanner leer = new Scanner(System.in);  
     
    int motor;
            
        System.out.println("Ingrese una opción: ");
        motor=leer.nextInt();
        
        switch (motor){
            case 1:
                System.out.println("La bomba es una bomba de agua.");
                break;
            case 2:
                System.out.println("La bomba es una bomba de gasolina.");
                break;
            case 3:
                System.out.println("La bomba es una bomba de homrigón.");
                break;
            case 4:
                System.out.println("La bomba es una bomba de pasta alimenticia.");
                break;
            default:
                System.out.println("La opción ingresada no es válida.");
                
        } 
    }
 }


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
public class ejerc12 {

   

/**
 *
 * @author erika
     * @param args
 */
 
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese el numero 1 que desea validar:");
        int num1 = leer.nextInt();
        System.out.println("ingrese el numero 2 que desea validar como multiplo del numero 1:");
        int num2 = leer.nextInt();
        //invocar el procedimiento
        multiplo(num1,num2);  
    }
 
    //procedimiento
    public static void multiplo(int num1,int num2){
       
        if (num1%num2 == 0){
        System.out.println("El numero 1 es multiplo del numero 2");
        }
        else {
        System.out.println("El numero 1 no es multiplo del numero 2");
        }
      
              
    }
}
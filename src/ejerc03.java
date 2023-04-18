/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class ejerc03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1 = 5;
        int num2 = 2;
        
        System.out.println("num1:"+num1);
        int suma= num1 + num2;
        double division = (double)num1/num2;
        boolean bandera = num2 < num1;
        num1++;
        num1 *= 3;
        System.out.println("suma: "+suma);
        System.out.println("division: "+division);
        System.out.println("bandera:" +bandera);
        System.out.println("num1:"+num1);
        
    }
}
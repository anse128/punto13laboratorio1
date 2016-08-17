/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto13laboratorio1;

import java.util.Scanner;

import punto13laboratorio1.Fibonacci;

/**
 *
 * @author sebastian
 */
public class Punto13laboratorio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner (System.in);

        Fibonacci f;        
        int x;
        System.out.println("digite un numero");
        x = lector.nextInt();
        f = new Fibonacci();
        
        f.Serie(x);
    }
    
}
        
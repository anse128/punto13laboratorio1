/*
Implementar un programa que utilice clases y que permita visualizar los primeros 
n términos de la serie Fibonacci.
 */
package punto13laboratorio1;

import java.util.Scanner;



public class Fibonacci {
    int x;
    
    public void Serie(int x)
    {
        int i,anterior,actual;
        anterior=0;
        actual = 0;
        i = 0;
  
        int a=0;
        //if(x>1)
            while (actual<x){
                actual+=anterior;
                anterior=i;
                if(a==1)
                    actual=1;
                a++;
                i=actual;
                System.out.println(actual);
            }
    }
    
}

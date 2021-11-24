/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ud3bucles;

/**
 *
 * @author a073673590j
 */
import java.util.Scanner;
public class Ejs2y4 {

    public static void main(String[] args)
    {
        Scanner cin = new Scanner(System.in);
        
        int v1, v2, i;
        
        System.out.println("Introduce dos valores:");
        v1 = cin.nextInt();
        v2 = cin.nextInt();
        
        if (v1 > v2)
        {
            i = v1;
            v1 = v2;
            v2 = i;
        }
        
        System.out.println("De menor a mayor: ");
        /*menor a mayor*/
        for (i = v1; i <= v2; i++) 
        {
            System.out.println(i);
        }
        
        System.out.println("De mayor a menor: ");
        /*mayor a menor*/
        for (i = v2; i >= v1; i--) 
        {
            System.out.println(i);
        }
        
    }
    
}

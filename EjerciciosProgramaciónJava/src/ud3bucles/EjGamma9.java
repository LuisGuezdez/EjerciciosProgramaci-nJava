/*
 * Proyecto UD3Bucles - Archivo EjGamma9.java - Compañía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

package ud3bucles;

/**
 *
 * @author Luis  Rodríguez <isguezdez@gmail.com>
 * @version 1.0
 * @date 27 oct. 2021 16:55:40
 */
import java.util.Scanner;
public class EjGamma9 
{
    public static void main(String[] args) 
    {
        Scanner cin = new Scanner(System.in);

        int v1;
        
        System.out.print("Introduce un valor:");
        
        v1 = cin.nextInt();
        
        for (int i = 1; i <= v1; i++) 
        {
            for (int k = v1; k > i; k--) 
            {
                System.out.print(" ");
            }
            
            for (int j = 0; j < i; j++) 
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}

/*
 * Proyecto UD3Bucles - Archivo EjGamma11.java - Compañía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

package ud3bucles;

/**
 *
 * @author Luis  Rodríguez <isguezdez@gmail.com>
 * @version 1.0
 * @date 27 oct. 2021 18:50:35
 */
import java.util.Scanner;
public class EjGamma11 
{
    public static void main(String[] args) 
    {
        Scanner cin = new Scanner(System.in);

        int v1;
        
        System.out.print("Introduce un valor:");
        
        v1 = cin.nextInt();
        
        for (int i = 1; i <= v1; i++) 
        {
            if (i != 1 && i != v1) 
            {
                System.out.print("* ");
                for (int k = 2; k < v1; k++) 
                {
                    System.out.print("  ");
                }
                System.out.print("*");
                System.out.println("");
            }
            else 
            {
                for (int j = 0; j < v1; j++) 
                {
                    System.out.print("* ");
                }
                System.out.println("");
            }
        }
    }
}

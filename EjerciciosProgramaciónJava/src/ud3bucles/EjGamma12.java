/*
 * Proyecto UD3Bucles - Archivo prueba.java - Compañía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

package ud3bucles;

/**
 *
 * @author Luis  Rodríguez <isguezdez@gmail.com>
 * @version 1.0
 * @date 27 oct. 2021 19:58:58
 */
import java.util.Scanner;
public class EjGamma12 
{
    public static void main(String[] args) 
    {
        Scanner cin = new Scanner(System.in);
        
        int v1, rest;
        boolean primo = true;
        
        System.out.print("Introduce un numero: ");
        v1 = cin.nextInt();
        
        for (int i = 2; i <= v1; i++) 
        {
            for (int j = 2; j < i; j++) 
            {
                rest = i % j;
                if (rest == 0) 
                {
                    primo = false;
                }
                
            }
            if (primo == true)
            {
                System.out.println(i);
            }
            primo = true;
        }
    }
}

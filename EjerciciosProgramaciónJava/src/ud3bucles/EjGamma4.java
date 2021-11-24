/*
 * Proyecto UD3Bucles - Archivo EjGamma4.java - Compañía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

package ud3bucles;

/**
 *
 * @author Luis  Rodríguez <isguezdez@gmail.com>
 * @version 1.0
 * @date 25 oct. 2021 20:55:21
 */
import java.util.Scanner;
public class EjGamma4 
{
    public static void main(String[] args) 
    {
       Scanner cin = new Scanner(System.in);
       
       int val, calc;
       
        System.out.println("Introduce un numero entero:");
        
        val = cin.nextInt();
        
        for (int i = 1; i <= val; i++) 
        {
            System.out.println("Tabla del " + i + ":");
            for (int j = 1; j <= 10; j++) 
            {
                calc = i * j;
                System.out.println(i + " x " + j + " = " + calc);
            }
            System.out.println("");
        }
    }
}

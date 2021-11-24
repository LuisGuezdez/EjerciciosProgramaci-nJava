/*
 * Proyecto UD3Bucles - Archivo EjGamma3.java - Compañía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

package ud3bucles;

/**
 *
 * @author Luis  Rodríguez <isguezdez@gmail.com>
 * @version 1.0
 * @date 25 oct. 2021 20:50:10
 */
public class EjGamma3 
{
    public static void main(String[] args) 
    {
        for (int i = 0; i < 10; i++) 
        {
            for (int j = 0; j < i; j++) 
            {
                System.out.print(i);
            }
            System.out.println("");
        }
    }
}

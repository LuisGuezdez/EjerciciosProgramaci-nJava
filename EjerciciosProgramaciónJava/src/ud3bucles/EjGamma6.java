/*
 * Proyecto UD3Bucles - Archivo EjGamma6.java - Compañía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

package ud3bucles;

/**
 *
 * @author Luis  Rodríguez <isguezdez@gmail.com>
 * @version 1.0
 * @date 25 oct. 2021 21:12:43
 */
public class EjGamma6 
{
    public static void main(String[] args) 
    {
        for (int i = 0; i < 24; i++) 
        {
            for (int j = 0; j < 60; j++) 
            {
                if (i < 10) 
                {
                    System.out.print("0" + i);
                }
                else
                {
                    System.out.print(i);
                }
                if (j < 10) 
                {
                    System.out.print(":0" + j);
                }
                else
                {
                    System.out.print(":" + j);
                }
                System.out.println("");
            }
        }
    }
}

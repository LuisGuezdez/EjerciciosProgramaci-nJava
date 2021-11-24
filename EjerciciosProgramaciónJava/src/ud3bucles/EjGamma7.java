/*
 * Proyecto UD3Bucles - Archivo EjGamma7.java - Compañía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

package ud3bucles;

/**
 *
 * @author Luis  Rodríguez <isguezdez@gmail.com>
 * @version 1.0
 * @date 25 oct. 2021 21:21:28
 */
public class EjGamma7 
{
    public static void main(String[] args) 
    {
        
        for (int i = 0; i < 24; i++) 
        {
            for (int j = 0; j < 60; j++) 
            {
                for (int k = 0; k < 60; k++) 
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
                    if (k < 10) 
                    {
                        System.out.print(":0" + k);
                    }
                    else
                    {
                        System.out.print(":" + k);
                    }
                    
                    System.out.println("");
                }   
            }
        }
    }
}

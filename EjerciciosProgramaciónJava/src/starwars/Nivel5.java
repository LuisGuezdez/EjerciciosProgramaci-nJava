/*
 * Proyecto StarWars - Archivo Nivel5.java - Compañía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

package starwars;

import java.util.Scanner;

/**
 *
 * @author Luis  Rodríguez <isguezdez@gmail.com>
 * @version 1.0
 * @date 2 nov. 2021 16:06:42
 */
public class Nivel5 
{
    public static void main(String[] args) 
    {
        Scanner leer = new Scanner(System.in);
        
        int M, S, fact1 = 1, fact2 = 1, total, resp;
        
        M = (int)(Math.random() * (10 - 5 + 1) + 5);
        for (int i = 1; i <= M; i++) 
        {
            fact1 = fact1 * i;
        }
        
        S = (int)(Math.random() * (10 - 5 + 1) + 5);
        for (int i = 1; i <= S; i++) 
        {
            fact2 = fact2 * i;
        }
        
        total = fact1 + fact2;
       
        resp = leer.nextInt();
        
        /*ESTO SE USA CUANDO SE UNE TODO*/
        /*if (resp != total) */
        /*{
           /* respCor = false;
            System.out.println("MAL");
        }
        else
        {
            System.out.println("BIEN");
        }*/
    }
}

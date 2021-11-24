/*
 * Proyecto StarWars - Archivo StarWars.java - Compañía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package starwars;

import java.util.Scanner;

/**
 *
 * @author Luis Rodríguez <isguezdez@gmail.com>
 */
public class Nivel4 
{
    public static void main(String[] args) 
    {
        Scanner leer = new Scanner(System.in);
        
        int resp, rest, v1, siono = 0;
        
        boolean primo = true;
        
       
        v1 = (int)(Math.random() * (100 - 10 + 1) + 10);
        System.out.println(v1);
        
        for (int j = 2; j < v1; j++) 
        {
            rest = v1 % j;
            if (rest == 0) 
            {
                primo = false;
            }

        }
        if (primo == true)
        {
            System.out.println("es primo");
            siono = 1;
        }
        else
        {
            System.out.println("no es primo");
        }
                
        resp = leer.nextInt();
        
        /*ESTO SE USA CUANDO SE UNE TODO*/
        /*if (resp != siono) */
        /*{*/
           /* respCor = false;
            System.out.println("MAL");
        }
        else
        {
            System.out.println("BIEN");
        }*/
    }  
}

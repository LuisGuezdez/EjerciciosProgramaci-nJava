/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package starswarscodigos;

/**
 *
 * @author rodfe
 * @version 1.0
 * @date 1 nov. 2021 20:58:04
 */
import java.util.Scanner;
public class Nivel3 
{
    public static void main(String[] args) 
    {
        Scanner leer = new Scanner(System.in);
        
        int N, fact = 1, resp;
        
        N = (int)(Math.random() * (100 - 50 + 1) + 50);
        N = N / 10;
        for (int i = 1; i <= N; i++) 
        {
            fact = fact * i;
        }
        
        resp = leer.nextInt();
        
        /*ESTO SE USA CUANDO SE UNE TODO*/
        /*if (resp != fact) */
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

/*
 * Proyecto UD3Bucles - Archivo EjGamma8.java - Compañía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

package ud3bucles;

/**
 *
 * @author Luis  Rodríguez <isguezdez@gmail.com>
 * @version 1.0
 * @date 25 oct. 2021 21:25:32
 */
public class EjGamma8 
{
    public static void main(String[] args) 
    {
        int dias;
        
        
        for (int mes = 1; mes <= 12; mes++) 
        {
            switch (mes) 
            {
                 case 1: case 3: case 5: case 7:
                 case 8: case 10: case 12:
                     dias = 31;


                         for (int j = 1; j <= dias; j++) 
                         {
                             if (j < 10) 
                             {
                                 System.out.print("0" + j);
                             }
                             else
                             {
                                 System.out.print(j);
                             }
                             if (mes < 10) 
                             {
                                 System.out.print("/0" + mes);
                             }
                             else
                             {
                                 System.out.print("/" + mes);
                             }
                             System.out.println("");
                         }
                     
 

                     break;
                 case 4: case 6: case 9: case 11:
                     dias = 30;
                     for (int j = 1; j <= dias; j++) 
                         {
                             if (j < 10) 
                             {
                                 System.out.print("0" + j);
                             }
                             else
                             {
                                 System.out.print(j);
                             }
                             if (mes < 10) 
                             {
                                 System.out.print("/0" + mes);
                             }
                             else
                             {
                                 System.out.print("/" + mes);
                             }
                             System.out.println("");
                         }
                     break;



                 case 2:
                     dias = 28;
                     for (int j = 1; j <= dias; j++) 
                         {
                             if (j < 10) 
                             {
                                 System.out.print("0" + j);
                             }
                             else
                             {
                                 System.out.print(j);
                             }
                             if (mes < 10) 
                             {
                                 System.out.print("/0" + mes);
                             }
                             else
                             {
                                 System.out.print("/" + mes);
                             }
                             System.out.println("");
                         }
                     break;



                 default:
                     break;
            }
        }    
    }
}

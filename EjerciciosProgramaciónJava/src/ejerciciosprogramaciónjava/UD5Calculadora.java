/*
 * Proyecto EjerciciosProgramaci_nJava - Archivo UD5Calculadora.java - Compañía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

package ejerciciosprogramaciónjava;

/**
 *
 * @author Luis  Rodríguez <isguezdez@gmail.com>
 * @version 1.0
 * @date 22 nov. 2021 21:29:23
 */
import java.util.Scanner;
public class UD5Calculadora 
{
    public static void main(String[] args) 
    {
        Scanner cin = new Scanner(System.in);
        int opcion;
       do
       {
           //menu
           System.out.println("Elija una opción: \n" +
            "1. Suma (A + B)\n" +
            "2. Resta (A - B)\n" +
            "3. Multiplicación (A * B)\n" +
            "4. División (A / B)\n" +
            "5. Área de un rectángulo (Base x Altura)\n" +
            "6. Área de un triángulo equilátero (Base x Altura / 2)\n" +
            "7. Área de un círculo (Pi x R²)\n" +
            "8. Seno, Coseno y Tangente (de X)\n" +
            "9. Salir.");
           opcion = cin.nextInt();
           
           opciones(opcion);
           
           
       }while(opcion != 9);
    }
    public static void opciones(int x) 
    {
        switch(x)
        {
            case 1:
                break;
                
            case 2:
                break;
                
            case 3:
                break;
                
            case 4:
                break;
                
            case 5:
                break;
                
            case 6:
                break;
                
            case 7:
                break;
                
            case 8:
                break;
                
            case 9:
                break;
                
            default:
                break;
        }
    }
}

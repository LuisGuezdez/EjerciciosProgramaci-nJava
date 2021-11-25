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
        //Scanner cin = new Scanner(System.in);
        int opcion;
       do
       {
           Scanner cin = new Scanner(System.in);
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
           
           System.out.println("");
       }while(opcion != 9);
    }
    
    //switch para entrar a las distintas opciones
    public static void opciones(int x) 
    {
        switch(x)
        {
            //suma
            case 1:
                sout(suma());
                break;
                
            //restar
            case 2:
                sout(resta());
                break;
                
            //multiplicar
            case 3:
                sout(multiplicacion());
                break;
                
            //dividir
            case 4:
                sout(division());
                break;
                
            //area rect.
            case 5:
                sout(areaRect());
                break;
                
            //area trin. eq.
            case 6:
                sout(areaTri());
                break;
                
            //area circulo
            case 7:
                sout(areaCir());
                break;
                
            //funciones trigono
            case 8:
                sout(trigon());
                break;
                
            //salir
            case 9:
                System.out.println("Has salido");
                break;
                
            default:
                System.out.println("Opción no válida");
                break;
        }
    }
    
    
    public static double pedir( int min, int max, String t)
    {
        Scanner cin = new Scanner(System.in);
        double num;
        //1 a 4
        if(min == 1)
        {
            //B de division
            if(max == 1)
            {
                do
                {
                    System.out.print("Dime " + t + ": ");
                    num = cin.nextDouble();
                }while(num == 0);
            }
            //todos los demás
            else
            {
                System.out.print("Dime " + t + ": ");
                num = cin.nextDouble();
            }
        }
        //5 a 8
        else
        {
            do
            {
                System.out.print("Dime " + t + ": ");
                num = cin.nextDouble();
                if(num < min || num > max)
                    System.out.println("Introduce valores válidos.");
            }while(num < min || num > max);
        }
        
        
        return num;
    }
    
    public static void sout(double res)
    {
        System.out.println("Su resultado es: " + res);
    }
            
    
    public static double suma()
    {
        double x = pedir(1, 0, "A");
        double y = pedir(1, 0, "B");
        double resp = x + y;
        return resp;
    }
    
    public static double resta()
    {
        double x = pedir(1, 0, "A");
        double y = pedir(1, 0, "B");
        double resp = x - y;
        return resp;
    }
    
    public static double multiplicacion()
    {
        double x = pedir(1, 0, "A");
        double y = pedir(1, 0, "B");
        double resp = x * y;
        return resp;
    }
    
    public static double division()
    {
        double y, x, resp;  
        System.out.println("B no puede ser 0");
        x = pedir(1, 0, "A");
        y = pedir(1, 1, "B");
        
            
           
        
        resp = x / y;
        
        return resp;
    }
    
    public static double areaRect()
    {
        double y, x, resp;
        System.out.println("Valor máx.: 1000000");
        System.out.println("Valor mín.: 0");
        x = pedir(0, 1000000, "la base");
        y = pedir(0, 1000000, "la altura");
        resp = x * y;
        
        return resp;
    }
    
    public static double areaTri()
    {
        double y, x, resp;
        System.out.println("Valor máx.: 1000000");
        System.out.println("Valor mín.: 0");
        x = pedir(0, 1000000, "A");
        y = pedir(0, 1000000, "B");
        resp = (x * y / 2);
        
        return resp;
    }
    
    public static double areaCir()
    {
        double x, resp;
        System.out.println("Valor máx.: 360");
        System.out.println("Valor mín.: -360");
        x = pedir(-360, 360, "el radio");
        
        resp = Math.PI * (x * x);
        
        return resp;
    }
    
    public static double trigon()
    {
        double x, y, z, resp;
        System.out.println("Valor máx.: 1000000");
        System.out.println("Valor mín.: 0");
        x = pedir(0, 1000000, "el seno");
        y = pedir(0, 1000000, "el coseno");
        z = pedir(0, 1000000, "la tangente");
        
        resp = Math.sin(x);
        resp = Math.cos(y);
        resp = Math.tan(z);
        
        return resp;
    }
}
    

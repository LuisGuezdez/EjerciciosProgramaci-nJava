/*
 * Proyecto StarWars - Archivo Nivel1.java - Compañía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

package starwars;

import java.util.Scanner;

/**
 *
 * @author Luis  Rodríguez <isguezdez@gmail.com>
 * @version 1.0
 * @date 2 nov. 2021 18:53:16
 */
public class Nivel1 
{
    public static void main(String[] args) 
    {

        Scanner leer = new Scanner(System.in);

        int s1 = (int) (1 + Math.random() * 10);
        int s2 = (int) (20 + Math.random() * (30 - 20 + 1));
        int suma = 0;
       
        System.out.println("===NIVEL 1===");
        System.out.println("Los problemas empiezan cuando deben  realizar un "
                + "salto\nhiperespacial hasta el sistema estelar " + s1 + " en "
                + "el sector " + s2 + ", pero el\ncontrol de navegación está "
                + "estropeado y el computador tiene\nproblemas para calcular"
                + " parte de las coordenadas de salto.\nChewbacca, piloto "
                + "experto, se da cuenta de que falta el cuarto\nnúmero de "
                + "la serie. Recuerda de sus tiempos en la academia de\npilotos"
                + " que para calcularlo hay que hacer el sumatorio entre el"
                + "\nnº de sistema y el nº del sector (ambos inclusive). ¿Qué "
                + "debe introducir?");
       
        boolean respCor = true;

        for (int i = s1; i <= s2; i++) {
            suma += i;
        }
       
        int resp1 = leer.nextInt();

        if (resp1 != suma) {
            respCor = false;
            System.out.println("MAL");
        } else {
            System.out.println("¡ACERTASTE!");
        }
    }
}

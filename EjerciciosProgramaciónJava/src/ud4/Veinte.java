/*
 * Proyecto UD4 - Archivo UD4.java - Compañía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package ud4;

/**
 *
 * @author Luis Rodríguez <isguezdez@gmail.com>
 */
import java.util.Arrays;
import java.util.Scanner;

public class    Veinte
        
{
    public static void main(String[] args) 
    {
        Scanner cin = new Scanner(System.in);
        int[] nums = new int[1000];
        int val, cont = 0;
        
        for (int i = 0; i < nums.length; i++) 
        {
            nums[i] = (int)(Math.random() * (99 - 0 + 1) + 0);
        }
        
        System.out.print("Elige un valor: ");
        val = cin.nextInt();
        
        nums[98] = -3;
        nums[99] = -3;
        
        Arrays.sort(nums);
        if (Arrays.binarySearch(nums, val) == -1)
        {
            System.out.println("No hay");
        }
        else
        {
            System.out.println(Arrays.binarySearch(nums, val));
        }
    }   
}

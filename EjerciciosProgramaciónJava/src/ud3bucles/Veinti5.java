package ud3bucles;

/*25.Realiza   un  programa  para   determinar   cuánto   se   debe   pagar   por   una   llamada
internacional según la siguiente política de cobro:
◦El cobro depende del tiempo de la llamada y se tarifa por tramos.
◦Los primeros cinco minutos cuestan 1 euro.
◦Los siguientes tres minutos cuestan 80 céntimos.
◦Los siguientes dos minutos cuestan 70 céntimos.
◦Los siguientes minutos cuestan 50 céntimos cada uno*/


import java.util.Scanner;
public class Veinti5
{
    public static void main (String[] args) 
    {
        int min;
        double costo;
        Scanner cin = new Scanner(System.in);
        System.out.println("Introduzca los minutos usados: ");
        min = cin.nextInt();
        
        if (min <= 5)
        {
            costo = 1;
        }
        else if (min <= 8) 
        {
            costo = 1 + 0.8;
        }
        else if (min <= 10)
        {
            costo = 1 + 0.8 + 0.7;
        }
        else 
        {
            min = min - 10;
            costo = 1 + 0.8 + 0.7 + (min * 0.5);
        }
        System.out.println("Su llamada ha costado: " + costo + " euros");
    }
}

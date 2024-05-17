package claseprogram;

import java.util.Scanner;

public class conditional 
{
    public static double valorabs (double x )
    {
        double valor;
        if (x>=0){
            valor=x;
        }
        else {
            valor=-x;
        }
        return valor;

    }


    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        double n = Double.parseDouble(sc.nextLine());
        System.out.println("el valor absoluto es: "+ valorabs(n));
    }
}

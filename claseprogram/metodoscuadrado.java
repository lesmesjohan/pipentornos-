package claseprogram;
import java.util.Scanner;
public class metodoscuadrado 
{

    public static double f(double x) {
        double resul=x*x;
        return resul;
    }

    public static double suma (double x, double y){
        return x+y;
    }

    public static double area_rectangulo (double l,double a)
    {
        return l*a;
    }


    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite el numero");

        double d= Double.parseDouble(sc.nextLine());
        double y= Double.parseDouble(sc.nextLine());

        System.out.println("resultado del cuadrado"+ f(d));
        System.out.println("resultado de la suma"+ suma(d,y));
        System.out.println("resultado del area "+ area_rectangulo(d,y));



    }

    
}
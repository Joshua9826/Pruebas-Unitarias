
package Sumas;

/**
 *
 * @author joshua rivera
 */
public class Sumas{ 
    public int sumas(int a, int b){
        return a+b;
    }
    public int minhr(int min, int hr){
        return min*hr;
    }
    public int secmin(int min, int sec){
        return min*sec;
    }
    public static void main (String [] args){
        Sumas x= new Sumas();
        System.out.println("La suma es: "+ x.sumas(2, 3));
        System.out.println("Los segundos que hay en 1 minuto son: "+ x.minhr(60, 1));
        System.out.println("Los minutos que hay en 1 hora son: "+ x.secmin(1, 3600));
    }
}
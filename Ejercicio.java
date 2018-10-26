import java.util.*;
import java.util.*;
public class Ejercicio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      int num,cont=1;
      System.out.println("introduzca un numero : ");
      num=sc.nextInt();
    while (num != 0) //mientras num sea distinto de 0
    {
    if(num>0)
           //mayor que cero: positivo
           System.out.println("positivo");
           else
           //si no es positivo: es negativo
           System.out.println("negativo");
           //repetimos el proceso y volvemos a leer num
           System.out.print("introduzca otro numero:");
           num=sc.nextInt();
           cont++;
           }
           //al salir del mientras tenemos la corteza que num es 0
           System.out.print("haz introducido un 0 e ingreso " +cont+"veces");
   }
    }
    

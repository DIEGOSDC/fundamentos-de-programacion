import java.util.*;
 public class Ejemplo14 { 
 public static void main(String[] args) {
  int n;
   Scanner sc = new Scanner( System.in );
    do { 
    System.out.print("Escribe un n�mero entre 1 y 10: "); 
    n = sc.nextInt(); 
    }while (n<1 || n >10); 
    System.out.println("Ha introducido: " + n);
     } 
     }
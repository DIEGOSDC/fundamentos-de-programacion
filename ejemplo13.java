import java.util.*;
public class ejemplo13{
  public static void main(String[]args){
    int valor;
    Scanner in = new Scanner(System.in);
    do {
       System.out.print("escribe un numero entero<100: ");
       valor =in.nextInt();
       }while(valor>=100);
       System.out.println("a introducido:"+valor);
       
       }
       }
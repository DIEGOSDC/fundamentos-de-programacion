import java.util.Scanner;

public class Examen{
  
  public static void main(String args[]){
    String nombre;
    int horas;
    double pagoporhora,pagototal;
    Scanner teclado = new Scanner(System.in);
    
    System.out.println("¿como te llamas?");
    nombre = teclado.nextLine();
    System.out.println("¿cuentas horas trabajaste esta semana? ");
    horas = teclado.nextInt();
    System.out.println("cuento pagan por hora?");
    pagoporhora = teclado.nextDouble();
    pagototal = horas * pagoporhora;
    System.out.println("Hola" + nombre);
    }
    
    
 
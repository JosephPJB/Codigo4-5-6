import java.util.Scanner;

public class Codigo5 {
	public static void main (String[] args) {// Se agrego un main 
	    Scanner s = new Scanner(System.in);//Se agrego system.in dentro del parentesis
	    System.out.print("Introduzca un número: ");//Se recorrieron las comillas dentro del parentesis y se agrego .out en el system.
	    String ni = s.nextLine();
	    int c = Integer.parseInt(ni);//Se agrego un integer.parseint 
        int afo = 0;
	    int noAfo = 0;
	    while (c > 0) {//Se cambio ni por la c
		  int digito = (int)(c % 10);//Se cambio ni por la c
	      if ((digito == 3) || (digito == 7) || (digito == 8) || (digito == 9)) {
			afo++;
	      } else {
			noAfo++;
	      }//if else
		  c /= 10;//Se cambio ni por la c
		}//while//colocamos el cierre del while aqui para evitar que se repita el resultado
	    if (afo > noAfo) {
	      System.out.println("El " + ni + " es un número afortunado.");//Se cambio C por la ni y se agrego t en print
	    } else {
	      System.out.println("El " + ni + " no es un número afortunado.");//Se cambio  c por ni, de lo contrario no obtendriamos  el resultado deseado
	    }// else impresion
	}//main
}//class Codigo5
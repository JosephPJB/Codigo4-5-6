import java.util.Scanner;// Se importo el java util de Scanner  utilizarlo correctamemnte 
public class Codigo6 {
	public static void main (String [] args) {//agregamos una clase main para ejecutar el ejercicio
	    int[] n = new int[20];// Se agrego new 
	    for (int i = 0; i < 20; i++) {// 
	      n[i] = (int)(Math.random() * 381) + 20;
	      System.out.print(n[i] + " ");//falta la palabra out para que este bien escrito la impresion
	    }
	    System.out.println("\n¿Qué números quiere resaltar? ");//falta agregarle una letra a la palabra println para el salto de linea
	    System.out.print("(1 – los múltiplos de 5, 2 – los múltiplos de 7): ");
	    Scanner s = new Scanner(System.in);//se implementa el metodo de scanner para declara una variable 
	    int opcion = Integer.parseInt(s.nextLine());
	    int multiplo = (opcion == 1) ? 5 : 7;//se intercambiaron las posiciones de los puntos y el signo de interrogacion :?
	    for (int e : n) {// Se creo  un for y el char se reemplazo por int
	      if (e % multiplo == 0) {
	        System.out.print("[" + e + "] ");
	      }else {
	        System.out.print(e + " ");// cambiamos in por out
	      }// else
	    }//for
	}//llave de cierre main 
}//class codigo6
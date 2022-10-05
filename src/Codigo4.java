import java.util.Scanner;
public class Codigo4 {
  //Se agrego la clase main para poder hacer la ejecución
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);//Se agrego system.in dentro del parentesis y se importo el java.util de scaner
	    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
	    String j1 = s.nextLine();
	    System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
	    String j2 = s.nextLine();
	    //Agregando tuLowerCase en los valores de jugador1 y jugador2 
	    j1 = j1.toLowerCase();
	    j2 = j2.toLowerCase();
	    //Se agrego equals y break para comparar cadenas
	    if (j1.equals(j2)) {
	      System.out.println("Empate");
	    } else {
	    	int g = 2;
	      	switch(j1) {
	        case "piedra":
	        	if (j2.equals( "tijeras")) {
	        		g = 1;
	        	}
	        	break;
	        case "papel":
	        	if (j2.equals("piedra")) {//falta llave de cierre del if
	        		g = 1;
	        	}
	        	break;
	        case "tijera":
	        	if (j2.equals("papel")) {
	        		g = 1;
	        		}
	        		break;
	        default:
	        	System.out.println("Eleccion de jugadr incorrecta");
	        	break;
	      }
	      System.out.println("Gana el jugador " + g);
	    }   
	    
	}//main
}//class
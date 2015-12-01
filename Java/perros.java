import java.util.Scanner;
public class Ejercicio{

	static String nombre, estado;
	static float tamaño, largo, ancho, altura;

	public Ejercicio(){
		
	}
	public static void main(String[]args){
		Ejercicio clase= new Ejercicio();
		Scanner lec=new Scanner(System.in);
		System.out.print("Nombre de tu perro: ");
		nombre=lec.next();
		System.out.print("Estado Actual: ");
		estado=lec.next();
		System.out.print("-----------Raza--------");
		System.out.println("");
		clase.getraza(tamaño);
		System.out.print("-----------Tamaño--------");
		System.out.println("");
		clase.tamaño();
		System.out.println("Tamaño: " + tamaño);
	}

	double tamaño(){
		Scanner lec=new Scanner(System.in);
		System.out.println("Indica las dimenciones de tu perro");
		System.out.println("");
		System.out.print("Largo: ");
		largo=lec.nextInt();
		System.out.print("Ancho: ");
		ancho=lec.nextInt();
		System.out.print("Altura: ");
		altura=lec.nextInt();
		tamaño=largo*ancho*altura;

		return tamaño;
	}

	void getraza(double tamaño){
		Scanner lec= new Scanner(System.in);
		String raza;
		System.out.print("Raza: ");
		raza=lec.next();
		if(raza.equals("pastor")){
			System.out.println("Tu perro esta muy grande");
		}
		else{
			
		}
	}

}
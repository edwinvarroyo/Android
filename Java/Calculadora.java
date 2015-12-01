import java.util.Scanner;
public class Calculadora{
	
	public static Scanner lec= new Scanner(System.in);
	public static float a,b, r=0;
	public static int op;
	
	public Calculadora(){
		
	}
	public static void main(String[] args) {
		
		Calculadora operaciones= new Calculadora();
		boolean lop=true;
		
		while(lop){
			System.out.println("Qué operacion desea realizar?");
			System.out.println("1) Suma");
			System.out.println("2) Resta");
			System.out.println("3) Division");
			System.out.println("4) Multiplicacion");
			System.out.println("5) Salir");
	
			op=lec.nextInt();
	
			switch(op){
				case 1:
					operaciones.Suma();
					System.out.println("Total " + r);
					r=0;
					break;
				case 2:
					operaciones.Resta();
					System.out.println("Total " + r);
					r=0;
					break;
				case 3:
					operaciones.Division();
					System.out.println("Total " + r);
					r=0;
					break;
				case 4:
					operaciones.Multi();
					System.out.println("Total " + r);
					r=0;
					break;
				case 5:
					lop=false;
					break;
				default:
					System.out.println("Invalid option :c");
					break;
			}
		}
		System.out.println("Bye c:");

	}

	public float Suma(){
		System.out.print("numero 1: ");
		a=lec.nextFloat();
		System.out.print("numero 2: ");
		b=lec.nextFloat();
		r=a+b;

		return r;
	}
	public float Resta(){
		System.out.print("numero 1: ");
		a=lec.nextFloat();
		System.out.print("numero 2: ");
		b=lec.nextFloat();
		r=a-b;

		return r;
	}
	public float Division(){
		System.out.print("numero 1: ");
		a=lec.nextFloat();
		System.out.print("numero 2: ");
		b=lec.nextFloat();
		r=a/b;

		return r;
	}
	public float Multi(){
		System.out.print("numero 1: ");
		a=lec.nextFloat();
		System.out.print("numero 2: ");
		b=lec.nextFloat();
		r=a*b;

		return r;
	}
}
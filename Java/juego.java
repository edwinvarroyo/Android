import java.util.Scanner;
import java.util.Random;
class juego{
	public static void main(String [] args){
		Scanner lec=new Scanner(System.in);
		Random rand= new Random();
		int a=0, b=0, sa=0, sb=0;
		char preg;
		boolean play=true;
		String player1, player2;

		System.out.print("Jugador 1: ");
		player1=lec.next();
		System.out.print("Jugador 2: ");
		player2=lec.next();
		while(play==true){
			a= rand.nextInt();
			b=rand.nextInt();
	
			if(a>b){
				System.out.println("Gana jugador 1");
				sa=sa+1;
			}
			else{
				System.out.println("Gana jugador 2");
				sb=sb+1;
			}

			System.out.println(player1 + ": " + sa);
			System.out.println(player2 + ": " + sb);
			
			System.out.println("Revancha? s/n");
			preg=lec.next().charAt(0);
			
			if(preg =='s' || preg =='S'){
				
			}
			else{
				play=false;
				if(sa>sb ){
					System.out.println(player2 + " se la come");
				}
				if(a<b){
					System.out.println(player1 + " se la come");
				}
				if(a==b){
					System.out.println("Empate :v");						
				}
			}
		
		}
	}

}
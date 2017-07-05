import java.util.Scanner;

public class PGCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Programme PGCD !");
		int a_entrer = 0;
		int b_entrer = 0;
		
		while(a_entrer <= b_entrer){
			Scanner a = new Scanner(System.in);
			System.out.println("Entrer A :");
			a_entrer = a.nextInt();
			
			Scanner b = new Scanner(System.in);
			System.out.println("Entrer B :");
			b_entrer = b.nextInt();
			
			if(a_entrer <= b_entrer){
				System.out.println("A doit être supérieur à B");
				System.out.println(" ");
			}
		}
		
		
		int r = a_entrer;
		
		int loop = 1;
		while(r !=0){
			r = a_entrer % b_entrer;
			a_entrer = b_entrer;
			b_entrer = r;
		}
		
		System.out.println("PGCD = " + a_entrer);
	}

}

package piabilisim.staj;
import java.util.Scanner;

public class UcgenDriver {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter size");
		int size=scanner.nextInt();
		boolean deger=true;
		while (deger){
		if (size<=2)
		{
			System.out.println("Yanlis deger girdiniz tekrar deneyiniz !");
			System.out.println("Enter size");
			size=scanner.nextInt();
			if (deger)
			{
				deger=true;
			}
			else
			{
				deger=false;
			}
		}
		int bosluk=size;
		for (int i = 0; i <size; i++) 
		{
			for (int j=bosluk; j>= 0;j--) 
			{
				System.out.print(" ");
			}
			for (int x = 0; x <=i; x++) 
			{
				System.out.print("* ");
			}
			System.out.println("");
			bosluk--;
			deger=false;
			}
		}
	}
}
package piabilisim.staj;
import java.util.Scanner;
public class CemberDraw {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter size");
		int size=scanner.nextInt();
		if (size<=0)
		{
			System.exit(-1);
			System.out.println("Aralik degerlerini kontrol ediniz...");
		}
		else
		{
			for (int i = 0; i <size; i++) 
			{
				for (int x = 0; x <size; x++) 
				{
					System.out.print("* ");
			    }
			    System.out.println("");
			}
		}

	}

}

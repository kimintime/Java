import java.util.Scanner;
public class Loops {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		int width = 0, height = 0, i, j;
		
		System.out.print("Type in the height: ");
		height = reader.nextInt();
		
		System.out.print("Type in the width: ");
		width = reader.nextInt();
		
		while (height <= 0 || width <= 0) {
			System.out.println("Invalid height or width value.");
			
			System.out.print("Type in the height: ");
			height = reader.nextInt();
		
			System.out.print("Type in the width: ");
			width = reader.nextInt();
		}
		
		for(i = 0; i < height; i++) {
			System.out.print("\nX");
			
			for(j = 1; j < width; j++) {
				System.out.print("X");
				
			}
		}
	}
}
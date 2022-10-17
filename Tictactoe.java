import java.util.Scanner;
public class Tictactoe {
	public static void main(String[] args) {
		String greeting = "Welcome to play Tic-tac-toe!\n" + "Type in the player names.\n";

		String name1, name2;

		int[][] gameboard = {
							{0, 0, 0},
							{0, 0, 0},
							{0, 0, 0}
							};

		int turn;
		int moves = 9, winner = 0;

		Scanner reader = new Scanner(System.in);

		System.out.println(greeting);

		System.out.print("Player 1 name (X): ");
		name1 = reader.nextLine();
		
		System.out.print("Player 2 name (O): ");
		name2 = reader.nextLine();

		turn = randomizeStart();

		showBoard(gameboard);

		do {
			System.out.print("Player " +turn+ ": ");
			int square = reader.nextInt();
			boolean moveOk = saveMove(gameboard, turn, square);

			if(moveOk) {
				turn = (turn == 1) ? 2 : 1;
				moves--;

				showBoard(gameboard);
				winner = checkWinner(gameboard);
			}

			else {
				System.out.println("Square you chose is not available!");
			}
		} while ((moves > 0) && (winner == 0));

		if(winner != 0) {
			System.out.print("Winner is ");
			System.out.println((winner == 1) ? (name1) : (name2) + "!");
			System.out.println("Congratulations!");
		}

		else {
			System.out.println("Game was a tie!");
			System.out.println("Thank you for playing!");
		}
	}

	private static int randomizeStart() {
		int turn = 0, startNumber = 0;

		startNumber = (int) (Math.random() * 100) + 1;

		turn = (startNumber % 2 == 0) ? (1) : (2);
		return turn;
	}
 	
 	private static void showBoard(int[][] gameboard) {
 		int square = 1;

 		final int cross = character('X');
   		final int zero = character('0');

 		for(int row = 0; row < gameboard.length; row++) {
 			for(int column = 0; column < gameboard[row].length; column++) {

 				if(gameboard[row][column] == cross)
 					System.out.print('X');

 				else if(gameboard[row][column] == zero)
 					System.out.print('0');

 				else
 					System.out.print(square);


 				if(column == gameboard[row].length - 1)
 					System.out.println();

 				else
 					System.out.print('|');

 				square ++;
 			}

 			if(row != gameboard.length - 1)
 				System.out.println("-+-+-");
 		}
 	}

 	private static boolean saveMove(int[][] gameboard, int pNo, int r) {
 		int square = 1;
 		final int cross = character('X');
   		final int zero = character('0');

   		for(int row = 0; row < gameboard.length; row++) {
   			for(int column = 0; column < gameboard[row].length; column++) {

   				if (square == r) {
   					
   					if (gameboard[row][column] == cross || gameboard[row][column] == zero) {
   						return false;
   					}

   					else {
   						int character = (pNo == 1) ? cross : zero;
   						gameboard[row][column] = character;
						return true;
   					}
   				}

   				square++;
   			}
   		}

   		return false;
 	}

 	private static int checkWinner(int[][] gameboard) {
 		final int threeCrosses = character('X') * character('X') * character('X');
		final int threeZeros = character('0') * character('0') * character('0');

		for(int row = 0; row < gameboard.length; row++) {
			int multi = gameboard[row][0] * gameboard[row][1] * gameboard[row][2];

			if(multi == threeCrosses)
				return 1;

			if(multi == threeZeros)
				return 2;
		}

		for (int col = 0; col < gameboard[0].length; ++col) {
			int multi = gameboard[0][col] * gameboard[1][col] * gameboard[2][col];
			
			if (multi == threeCrosses)
				return 1; 
		
			if (multi == threeZeros)
				return 2; 
		}

		int tlbr = gameboard[0][0] * gameboard[1][1] * gameboard[2][2];
		int bltr = gameboard[2][0] * gameboard[1][1] * gameboard[0][2];

		if(tlbr == threeCrosses || bltr == threeCrosses)
			return 1;

		if(tlbr == threeZeros || bltr == threeZeros)
			return 2;

		return 0;

 	}

 	private static int character(char m) {
 		if(m == 'X')
 			return 1;

 		else if(m == '0')
 			return 2;

 		else
 			return 0;
 	}
	
}
import java.util.Scanner;

public class Play2048 {
	
	public static char getDirection() {
		while(true){
			System.out.println("Direction: ");
			String t = Config.in.next();
			if(t.length()==1){
				char dir = t.charAt(0);
				return dir;
			}
			else continue;
		}
		 // the null character, so the code will compile
	}
	
	public static void print_board(int[][] board) {
		
		System.out.println("---------------------");
		for(int i = 0; i < Config.DIM; i++){
			
			for(int j = 0; j < Config.DIM; j++){
				if(board[i][j]==0){
					System.out.print("|    ");
					
					}
				else{
					System.out.printf("|" + "%4d", board[i][j]);
					
					}
				
			}
			System.out.println("|");
			System.out.println("---------------------");
		}
	}
	
	public static void placeBlock(int[][] board) {
		int x,y;
		
		do{
			x = Config.rand.nextInt(Config.DIM);
			y = Config.rand.nextInt(Config.DIM);
		}while(board[x][y] != 0);
		board[x][y] = 2;
		}
	
	
	public static boolean handleInput(char dir, int[][] board) {
		switch(dir){
		case Config.LF: return moveLf(board);
		case Config.UP: return moveUp(board);
		case Config.DN: return moveDn(board);
		case Config.RT: return moveRt(board);
		}
		return false; // placeholder value, so the code will compile
	}
	
	public static boolean moveUp(int[][] board) {
		boolean flag = false;
		for(int c = 0; c < Config.DIM; c++){
			for(int r = 0; r < Config.DIM-1; r++ ){
				if (board[r][c] == 0 && board[r+1][c] !=0){
					flag = true;
				}
			}
		}
		for(int c = 0; c < Config.DIM; c++){
			for(int r = 0; r < Config.DIM-1; r++ ){
				if(board[r][c]==board[r+1][c] && board[r][c]!=0){
					flag = true;
				}
			}
		}
		for(int x = 0; x < Config.DIM; x++){
			for(int c = 0; c < Config.DIM; c++){
				for(int r = 0; r < Config.DIM-1; r++ ){
					if (board[r][c] == 0 && board[r+1][c] !=0){
						int temp = board[r][c];
						board[r][c] = board [r+1] [c];
						board[r+1][c] = temp;
					}
				}
			}
		}
		
			for(int c = 0; c < Config.DIM; c++){
				for(int r = 0; r < Config.DIM-1; r++ ){
					if(board[r][c]==board[r+1][c] && board[r][c]!=0){
						board[r][c] += board[r+1][c];
						board[r+1][c] = 0;
					}
				}
			}
		
		for(int z = 0; z < Config.DIM; z++){
			for(int c = 0; c < Config.DIM; c++){
				for(int r = 0; r < Config.DIM-1; r++ ){
					if (board[r][c] == 0 && board[r+1][c] !=0){
						int temp = board[r][c];
						board[r][c] = board [r+1] [c];
						board[r+1][c] = temp;
					}
				}
			}
		}
		return flag; // placeholder value, so the code will compile
	}
	
	public static boolean moveDn(int[][] board) {
		boolean flag = false;
		for(int c = 0; c < Config.DIM; c++){
			for(int r = Config.DIM-1; r > 0; r-- ){
				if (board[r][c] == 0 && board[r-1][c] !=0){
					flag = true;
				}
			}
		}
		for(int c = 0; c < Config.DIM; c++){
			for(int r = Config.DIM-1; r > 0; r--){
				if(board[r-1][c]==board[r][c] && board[r][c]!=0){
					flag = true;
				}
			}
		}
		for(int x = 0; x < Config.DIM; x++){
			for(int c = 0; c < Config.DIM; c++){
				for(int r = Config.DIM-1; r > 0; r-- ){
					if (board[r][c] == 0 && board[r-1][c] !=0){
						int temp = board[r][c];
						board[r][c] = board [r-1] [c];
						board[r-1][c] = temp;
					}
				}
			}
		}
		
			for(int c = 0; c < Config.DIM; c++){
				for(int r = Config.DIM-1; r > 0; r--){
					if(board[r-1][c]==board[r][c] && board[r][c]!=0){
						board[r][c] += board[r-1][c];
						board[r-1][c] = 0;
					}
				}
			}
		
		for(int z = 0; z < Config.DIM; z++){
			for(int c = 0; c < Config.DIM; c++){
				for(int r = Config.DIM-1; r > 0; r-- ){
					if (board[r][c] == 0 && board[r-1][c] !=0){
						int temp = board[r][c];
						board[r][c] = board [r-1] [c];
						board[r-1][c] = temp;
					}
				}
			}
		}
		return flag; // placeholder value, so the code will compile
	}
	
	public static boolean moveLf(int[][] board) {
		boolean flag = false;
		for(int r = 0; r < Config.DIM; r++){
				for(int c = 0; c < Config.DIM-1; c++ ){
					if (board[r][c] == 0 && board[r][c+1] !=0){
						flag = true;
				}
			}
		}
		for(int r = 0; r < Config.DIM; r++){
			for(int c = 0; c < Config.DIM-1; c++ ){
				if(board[r][c]==board[r][c+1] && board[r][c]!=0){
					flag = true;
				}
			}
		}
		for(int x = 0; x <4; x++){
			for(int r = 0; r < Config.DIM; r++){
				for(int c = 0; c < Config.DIM-1; c++ ){
					if (board[r][c] == 0 && board[r][c+1] !=0){
						int temp = board[r][c];
						board[r][c] = board [r] [c+1];
						board[r][c+1] = temp;
					}
				}
			}
		}
		
			for(int r = 0; r < Config.DIM; r++){
				for(int c = 0; c < Config.DIM-1; c++ ){
					if(board[r][c]==board[r][c+1] && board[r][c]!=0){
						board[r][c] += board[r][c+1];
						board[r][c+1] = 0;
					}
				}
			}
		
		for(int z = 0; z < Config.DIM; z++){
			for(int r = 0; r < Config.DIM; r++){
				for(int c = 0; c < Config.DIM-1; c++ ){
					if (board[r][c] == 0 && board[r][c+1] !=0){
						int temp = board[r][c];
						board[r][c] = board [r] [c+1];
						board[r][c+1] = temp;
					}
				}
			}
		}
		return flag; // placeholder value, so the code will compile
	}
	
	public static boolean moveRt(int[][] board) {
		boolean flag = false;
		for(int r = 0; r < Config.DIM; r++){
			for(int c = Config.DIM-1; c>0; c-- ){
				if (board[r][c] == 0 && board[r][c-1] !=0){
					flag = true;
				}
			}
		}
		for(int r = 0; r < Config.DIM; r++){
			for(int c = Config.DIM-1; c > 0; c--){
				if(board[r][c-1]==board[r][c] && board[r][c]!=0){
					flag = true;
				}
			}
		}
		for(int x = 0; x < Config.DIM; x++){
			for(int r = 0; r < Config.DIM; r++){
				for(int c = Config.DIM-1; c>0; c-- ){
					if (board[r][c] == 0 && board[r][c-1] !=0){
						int temp = board[r][c];
						board[r][c] = board [r] [c-1];
						board[r][c-1] = temp;
					}
				}
			}
		}
		
			for(int r = 0; r < Config.DIM; r++){
				for(int c = Config.DIM-1; c > 0; c--){
					if(board[r][c-1]==board[r][c] && board[r][c]!=0){
						board[r][c] += board[r][c-1];
						board[r][c-1] = 0;
					}
				}
			}
		
		for(int z = 0; z < Config.DIM; z++){
			for(int r = 0; r < Config.DIM; r++){
				for(int c = Config.DIM-1; c>0; c-- ){
					if (board[r][c] == 0 && board[r][c-1] !=0){
						int temp = board[r][c];
						board[r][c] = board [r] [c-1];
						board[r][c-1] = temp;
					}
				}
			}
		}
		return flag; // placeholder value, so the code will compile
	}
	
	public static boolean gameOver(int[][] board) {
		for(int r = 0; r<= Config.DIM-1; r++){
			for(int c = 0; c <= Config.DIM-1; c++){
				if (board[r][c] == 0){
					return false;
				}
					
			}
		}
		for(int r = 0; r<= Config.DIM-1; r++){
			for(int c = 0; c <= Config.DIM-1; c++){
				if (board[r][c] == 2048){
					return true;
				}
					
			}
		}
		// check for possible horizontal merges
		for(int r = 0; r<= Config.DIM-1; r++){
			for(int c = 1; c <= Config.DIM-2; c++){
				if (board[r][c] == board[r][c+1] || board[r][c] == board[r][c-1]){
					return false;
				}
			}
		}
		// check for possible vertical merges
		for(int c = 0; c<= Config.DIM-1; c++){
			for(int r = 1; r <= Config.DIM-2; r++){
				if (board[r][c] == board[r+1][c] || board[r][c] == board[r-1][c]){
					return false;
				}
			}
		}
		return true; // placeholder value, so the code will compile
	}
	
	public static void main(String[] args) {
		// set up the board for game play
				int[][] board = new int[4][4];
		// declare any game variables you may need
		int x1,x2,y1,y2;
		do{
		 x1 = Config.rand.nextInt(Config.DIM);
		 y1 = Config.rand.nextInt(Config.DIM);
		 x2 = Config.rand.nextInt(Config.DIM);
		 y2 = Config.rand.nextInt(Config.DIM);
		}while(x1==x2 && y1==y2);
		board[x1][y1] = 2;
		board[x2][y2] = 2;
		
		// print welcome message
		System.out.println("2048 controls:");
		System.out.println("\t" + Config.UP	+ ": move up");
		System.out.println("\t" + Config.LF	+ ": move left");
		System.out.println("\t" + Config.DN	+ ": move down");
		System.out.println("\t" + Config.RT	+ ": move right");
		// main game loop
		while(gameOver(board)==false){
			print_board(board);// display the board
			
			// get user input
			
			if(handleInput(getDirection(), board)==true)// modify the board
			placeBlock(board);// place random block if necessary
		}
		print_board(board);
		// handle end-of-game situation
	}
	
}

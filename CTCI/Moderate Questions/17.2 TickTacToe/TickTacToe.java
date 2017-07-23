/*
	Designing for an N*N Board
*/
public class TickTacToe{

	Piece hasWon3(Piece[][] board){
		int N = board.length;
		int row = 0;
		int col = 0;

		//Check rows
		for(row =0; row < N; row++){
			if(board[row][0] != Piece.Empty){
				for(col = 1; col < N; col++){
					if(board[row][col] != board[row][col-1])
						break;
				}
				if(col ==N) return board[row][0];
			}
		}

		//Check Columns
		for(col =0; col < N; col++){
			if(board[0][col] != Piece.Empty){
				for(row =1; row < N; row++){
					if(board[row][col] != board[row-1][col]) 
						break;
				}
				return board[0][col];

			}
		}

		//Check Diagonals
		if(board[0][0] != Piece.Empty){
			for(row =1; row < N; row++){
				if(board[row][row] != board[row-1][row-1])
					break;
			}
			if(row == N) return board[0][0];
		}

		//Check reverse diagonal

		if(board[N-1][0] != Piece.Empty){
			for(row =1; row < N; row++){
				if(board[N-row-1][row] != board[N-row][row-1])
					break;
			}
			if(row == N) return board[N-1][0]; 
		}

		return Piece.Empty;
	}
}




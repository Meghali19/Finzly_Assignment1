package com;

public class TicTacToe 
{
	public static final int SIZE = 3;
	public static final int EMPTY_STR = ' ';

	char currentPlayer = 'X';

	char [][]board = new char[SIZE][SIZE];


	// fill board with empty char

	public void fillBoard() 
	{

	for(int i =0;i<3;i++) 
	{

	for(int j =0;j<3;j++)
	{

	board[i][j]= ' ';

	}

	}

	}

	// print board

	public void printBoard() {

	System.out.println("----------");

	for(int i =0;i<SIZE;i++) {

	System.out.print("|");

	for(int j =0;j<SIZE;j++) {

	System.out.print( board[i][j] +"| ");

	}

	System.out.println("\n----------");

	}

	}

	// just apply condition for the valid move

	public boolean validMove(int row,int col) {

	if(row <0 || row>=3 || col <0 || col>=3 || board[row][col]!= ' ')

	return false;


	board[row][col] = currentPlayer;

	currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';

	return true;

	}


	//check for match is draw or not

	public boolean isDraw() {

	for(int i=0;i<SIZE;i++) {

	for(int j=0;j<SIZE;j++) {

	if(board[i][j] == EMPTY_STR)

	return false;

	}


	}

	return false;
	}

	// mention all winning possibility

	public boolean checkWin() {

	//For row

	for(int row =0;row<SIZE;row++) {

	if(board[row][0]!= EMPTY_STR && board[row][0]==board[row][1]&& board[row][1]==board[row][2])

	return true;

	}


	//for Column

	for(int col =0;col<SIZE;col++) {

	if(board [0][col]!= EMPTY_STR && board [0][col]==board[1][ col]&& board[1][ col]==board[2][ col])
         return true;

	}


	//Diagonal


	if(board[0][0] != EMPTY_STR && board[0][0] ==board[1][1] &&board[1][1]==board[2][2] )
         return true;


	if(board[0][2] != EMPTY_STR && board[0][2] ==board[1][1] &&board[1][1]==board[0][2] )
         return true;


	return false;

	}


}

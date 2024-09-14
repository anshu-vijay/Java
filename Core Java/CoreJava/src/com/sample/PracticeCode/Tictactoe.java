package com.sample.PracticeCode;

public class Tictactoe {

	public static void main(String[] args) {
		int[][] moves = { { 2, 0 }, { 0, 2 }, { 0, 0 }, { 2, 2 }, { 1, 1 }, { 1, 0 }, { 2, 1 }, { 0, 1 } };
		System.out.println(tictactoe(moves));

	}

	public static String tictactoe(int[][] moves) {
		char[][] myArray = new char[3][3];
		// System.out.println(Arrays.deepToString(myArray));
		int numberOfSquaresPlayed = 0;
		char whoseTurnItIs;
		boolean rowCheck = false, colCheck = false, diagCheck = false;
		for (int i = 0; i < moves.length; i++) {
			int[] position = moves[i];
			int row = position[0];
			int col = position[1];
			if (i % 2 == 0) {
				whoseTurnItIs = 'A';
				++numberOfSquaresPlayed;
				myArray[row][col] = whoseTurnItIs;
				rowCheck = checkRows(myArray, whoseTurnItIs);
				colCheck = checkCols(myArray, whoseTurnItIs);
				diagCheck = checkDiag(myArray, whoseTurnItIs);
				if (rowCheck || colCheck || diagCheck) {
					return String.valueOf(whoseTurnItIs);
				} else {
					if (numberOfSquaresPlayed == 8) {
						return "Draw";
					} else {
						return "Pending";
					}
				}
			} else if (i % 2 != 0) {
				whoseTurnItIs = 'B';
				++numberOfSquaresPlayed;
				myArray[row][col] = whoseTurnItIs;
				rowCheck = checkRows(myArray, whoseTurnItIs);
				colCheck = checkCols(myArray, whoseTurnItIs);
				diagCheck = checkDiag(myArray, whoseTurnItIs);
				if (rowCheck || colCheck || diagCheck) {
					return String.valueOf(whoseTurnItIs);
				} else {
					if (numberOfSquaresPlayed == 8) {
						return "Draw";
					} else {
						return "Pending";
					}
				}
			}
		}
		return null;

	}

	static void printBoard(char[][] board) {
		System.out.println("|---|---|---|");
		System.out.println("| " + board[0][0] + " | " + board[0][1] + " | " + board[0][2] + " |");
		System.out.println("|-----------|");
		System.out.println("| " + board[1][0] + " | " + board[1][1] + " | " + board[1][2] + " |");
		System.out.println("|-----------|");
		System.out.println("| " + board[2][0] + " | " + board[2][1] + " | " + board[2][2] + " |");
		System.out.println("|---|---|---|");
	}

	static boolean checkRows(char[][] board, char whoseTurnItIs) {
		if ((board[0][0] == board[0][1] && board[0][1] == board[0][2] && board[0][0] == whoseTurnItIs)
				|| (board[1][0] == board[1][1] && board[1][1] == board[1][2] && board[1][0] == whoseTurnItIs)
				|| (board[2][0] == board[2][1] && board[2][1] == board[2][2] && board[2][0] == whoseTurnItIs)) {
			return true;
		}
		return false;
	}

	static boolean checkCols(char[][] board, char whoseTurnItIs) {
		if ((board[0][0] == board[1][0] && board[1][0] == board[2][0] && board[0][0] == whoseTurnItIs)
				|| (board[0][1] == board[1][1] && board[1][1] == board[2][1] && board[0][1] == whoseTurnItIs)
				|| (board[0][2] == board[1][2] && board[1][2] == board[2][2] && board[0][2] == whoseTurnItIs)) {
			return true;
		}
		return false;
	}

	static boolean checkDiag(char[][] board, char whoseTurnItIs) {
		if ((board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] == whoseTurnItIs)
				|| (board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[0][2] == whoseTurnItIs)) {
			return true;
		}
		return false;
	}

}

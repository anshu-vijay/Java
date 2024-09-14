package com.sample.PracticeCode;

public class TictactoeLogic2 {

	public static void main(String[] args) {
        int[][] moves = { { 2, 0 }, { 0, 2 }, { 0, 0 }, { 2, 2 }, { 1, 1 }, { 1, 0 }, { 2, 1 }, { 0, 1 } };
        System.out.println(tictactoe(moves));
    }

    public static String tictactoe(int[][] moves) {
        char[][] board = new char[3][3];
        int totalMoves = moves.length;

        for (int i = 0; i < totalMoves; i++) {
            int row = moves[i][0];
            int col = moves[i][1];
            char player = (i % 2 == 0) ? 'A' : 'B';

            board[row][col] = player;

            // Check if the current move wins the game
            if (checkWinner(board, player, row, col)) {
                return String.valueOf(player);
            }
        }

        return totalMoves == 9 ? "Draw" : "Pending";
    }

    private static boolean checkWinner(char[][] board, char player, int row, int col) {
        // Check the row
        if (board[row][0] == player && board[row][1] == player && board[row][2] == player) return true;

        // Check the column
        if (board[0][col] == player && board[1][col] == player && board[2][col] == player) return true;

        // Check the diagonals
        if (row == col && board[0][0] == player && board[1][1] == player && board[2][2] == player) return true;
        if (row + col == 2 && board[0][2] == player && board[1][1] == player && board[2][0] == player) return true;

        return false;
    }
}